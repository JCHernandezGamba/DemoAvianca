# Introducción
Demo automatización de la página web de Avianca - Reserva de vuelos.

# Pre-requisitos
En esta sección se encuentran los pre-requisitos y dependencias para la instalación y la ejecución de la automatización.
1. [Descarga/Clonar el proyecto.](https://docs.github.com/es/github/creating-cloning-and-archiving-repositories/cloning-a-repository-from-github/cloning-a-repository)
2. [Descargar OpenJDK.](https://download.java.net/java/GA/jdk15.0.2/0d1cfde4252546c6931946de8db48ee2/7/GPL/openjdk-15.0.2_windows-x64_bin.zip)
3. [Descargar Gradle.](https://gradle.org/next-steps/?version=6.7.1&format=all)
4. [Configurar variables de entorno para Java y Gradle.](https://www.java.com/es/download/help/path_es.html)

# Compilación y ejecución
1. Validar la instalación y configuración de variables de entorno para java y gradle.
- Java: Abrir línea de comandos y ejecutar "java -version". El sistema debe responder con la versión actualmente instalada.
- Gradle: Abrir línea de comandos y ejecutar "gradle -v". El sistema debe responder con la versión actualmente instalada.

2. Ejecutar el comando "gradlew.bat" para compilar y descargar dependencias requeridas.

3. Para la ejecución de la prueba se debe ejecutar el comando gradle clean test aggregate -Descenario="--tags @reservaSoloIda".


# Preguntas Frecuentes
1. La automatización no ejecuta debido a que el sistema no encuentra Gradle.
- Cuando el sistema arroje errores relacionados a que no encuentra gradle se debe a que las variables de entorno y/o rutas no se encuentran configuradas adecuadamente.

2. Se presentan errores al momento de compilar, construir y/o ejecutar el proyecto.
- En estos casos es recomendable ejecutar desde línea de comandos y ubicados en la ruta raíz del proyecto el comando "gradlew.bat", que permite descargar y reparar las dependencias necesarias para la ejecución del proyecto.

3. La automatización no ejecuta y el sistema arroja errores relacionados al driver.
- En este caso se debe revisar que las versiones del navegador correspondan a las del driver. Si se requiere actualizar el driver se debe dejar en la ruta "src/test/resources/webdriver/windows"
- Si el problema persiste se deben revisar la configuración del driver (Archivos src/test/resources/serenity.conf y serenity.properties)

4. La automatización se ejecuta pero el sistema arroja errores por timeouts.
- Para incrementar los tiempos de timeout se debe modificar las propiedades webdriver.timeouts del archivo serenity.properties.

5. ¿Dónde están alojadas las evidencias de la ejecución?
- Se encuentra alojadas en la carpeta target/site/serenity. En esta ruta se encuentra el archivo index.html que se puede abrir desde cualquier navegador.
