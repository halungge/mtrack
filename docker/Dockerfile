FROM adoptopenjdk/openjdk11:latest
MAINTAINER Magdalena Luz "magdalena.luz@protonmail.ch"
RUN mkdir -p /opt/app
RUN apt-get update;
RUN apt-get install -y curl
COPY ./jars/mtrack-0.1.0-SNAPSHOT-boot.jar /opt/app/mtrack.jar
ENTRYPOINT ["java"]
CMD ["-jar", "/opt/app/mtrack.jar" ]
EXPOSE 8080


