FROM maven:3.8.6-openjdk-18-slim AS build

LABEL maintainer="jahdevop@gmail.com"

WORKDIR /home/app
COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
COPY --from=build /home/app/target/*.jar sp-backend.jar

ENTRYPOINT ["sh", "-c", "java", "-jar","/sp-backend.jar" ]