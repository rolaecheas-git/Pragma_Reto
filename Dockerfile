# Imagen base con JDK 17 (puedes cambiar la versión)
FROM eclipse-temurin:17-jdk-alpine

# Argumento para copiar el JAR generado
ARG JAR_FILE=target/*.jar

# Copiamos el JAR a la imagen
COPY ${JAR_FILE} app.jar

# Puerto expuesto (mismo que uses en Spring Boot)
EXPOSE 8080

# Comando de arranque
ENTRYPOINT ["java","-jar","/app.jar"]
