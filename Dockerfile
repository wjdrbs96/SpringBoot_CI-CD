FROM openjdk:11-jre-slim

WORKDIR /root

EXPOSE 8080

CMD java -jar *.jar .