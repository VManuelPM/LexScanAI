# LexScanAI

LexScanAI es una aplicación web desarrollada en Java con Spring Boot que permite analizar contratos legales en formato PDF utilizando inteligencia artificial.

## Tutorial
Lo encuentras en el siguiente [link](https://www.amoelcodigo.com)

## Características

- Subida de archivos PDF de contratos legales.
- Extracción automática de texto desde archivos PDF.
- Análisis del contrato mediante un modelo AI (Ollama).
- Resumen, identificación de riesgos, fechas, partes involucradas y tipo de contrato.

## Tecnologías utilizadas

- Java 17+
- Spring Boot
- Maven
- Apache PDFBox
- Spring AI (Ollama)
- Thymeleaf (para plantillas HTML)

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/lexscanai.git
   cd lexscanai
   ```

2. Construye el proyecto:
   ```bash
   mvn clean install
   ```
3. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run
   ```
4. Accede a la aplicación en http://localhost:8080

## Uso
Sube un archivo PDF de un contrato desde la página principal.
El sistema extraerá el texto y lo analizará usando el modelo AI.
Recibirás un resumen y análisis del contrato.

## Configuración
Asegúrate de tener configurado el modelo Ollama y los parámetros necesarios en tu archivo application.properties o application.yml.


## Licencia
MIT
<hr></hr> Desarrollado por amoelcodigo.com