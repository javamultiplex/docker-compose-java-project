FROM adoptopenjdk/openjdk11:alpine
EXPOSE 8081
ARG JAR_FILE=blog-ui-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} blog-ui.jar
ENTRYPOINT ["java","-jar","/blog-ui.jar"]