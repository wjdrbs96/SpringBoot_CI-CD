FROM openjdk:11-jre-slim

WORKDIR /root

COPY ./*.jar .

CMD java -jar *.jar .