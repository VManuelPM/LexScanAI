package com.amoelcodigo.lexscanai.controllers;

import com.amoelcodigo.lexscanai.services.AiService;
import com.amoelcodigo.lexscanai.services.PdfService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
@AllArgsConstructor
public class UploadController {

    private PdfService pdfService;
    private AiService aiService;

    @GetMapping("/")
    public String home(){
        return "upload";
    }

    @PostMapping("/analyze")
    public String analyzePdf(@RequestParam("file") MultipartFile file, Model model) throws Exception {
        //Guardar archivo en temp file
        File tempFile = File.createTempFile("upload-", ".pdf");
        file.transferTo(tempFile);

        //Extraer el texto con PDFBox 3
        String texto = pdfService.extractText(tempFile);

        //Analizar con Ollama
        String analisis = aiService.analyze(texto);

        model.addAttribute("analisis", analisis);
        return "result";
    }
}
