FROM java:8-jre
WORKDIR usr/src
ADD ./target/ExampleRepo-0.0.1-SNAPSHOT.jar /usr/src/ExampleRepo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","ExampleRepo-0.0.1-SNAPSHOT.jar"]
ENV MYSQL_UST_SAMPLE=jdbc:mysql://localhost:3306/dockdb?createDatabaseIfNotExist=true&user=root&password=password
ENV MYSQL_ROOT_PASSWORD=password