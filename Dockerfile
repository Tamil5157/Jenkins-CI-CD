 
FROM eclipse-temurin:25-jdk
 
WORKDIR /app
 
COPY Jenkins.java .
 
RUN javac Jenkins.java
 
EXPOSE 8081
 
CMD ["java", "Jenkins"]
 
