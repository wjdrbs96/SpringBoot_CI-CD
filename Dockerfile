FROM openjdk:11-jre-slim

WORKDIR /root

EXPOSE 8080

ADD ./*.jar .

CMD java -jar *.jar .