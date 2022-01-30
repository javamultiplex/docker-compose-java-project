FROM adoptopenjdk/openjdk11:alpine
EXPOSE 8080
ARG JAR_FILE=blog-api-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} blog-api.jar
ENTRYPOINT [ "java", "-jar" ,"/blog-api.jar" ]