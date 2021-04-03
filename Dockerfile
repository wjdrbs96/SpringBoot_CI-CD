FROM openjdk:11-jre-slim

ADD ./*.jar .

CMD java -jar *.jar .

EXPOSE 8080