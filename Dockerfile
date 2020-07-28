FROM openjdk:8-alpine

COPY target/uberjar/russell.dev.jar /dev.russell/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/dev.russell/app.jar"]
