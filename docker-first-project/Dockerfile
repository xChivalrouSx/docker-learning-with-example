FROM openjdk:17
EXPOSE 9091

RUN mkdir -p /home/app

ADD target/classes/application.properties /home/app/application.properties
ADD target/docker-first-project.jar /home/app/docker-first-project.jar

ENTRYPOINT ["java", "-jar", "-Dspring.data.mongodb.uri=mongodb://<mongo-username>:<mongo-password>@<mongo-host>:<mongo-port>/<mongo-default-db>?authSource=admin", "/home/app/docker-first-project.jar"]