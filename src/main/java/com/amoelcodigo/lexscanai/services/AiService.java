package com.amoelcodigo.lexscanai.services;

import lombok.AllArgsConstructor;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AiService {

    private final OllamaChatModel ollamaChatModel;

    public String analyze(String textContent){
        String prompt = """
                Eres un abogado experto. Analiza el siguiente contrato legal y proporciona:
                            1. Resumen en 3-5 puntos.
                            2. Posibles riesgos o cláusulas problemáticas.
                            3. Fechas y partes involucradas.
                            4. Tipo de contrato.
                
                            Contrato:
                            %s
                """.formatted(textContent);

        return ollamaChatModel.call(prompt);
    }

}
