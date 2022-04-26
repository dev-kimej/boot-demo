FROM openjdk:11
MAINTAINER Kim EunJeong <siemprehh@daum.net>

VOLUME /tmp
EXPOSE 8090

CMD ["./mvnw", "clean", "install"]
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo-app.jar"]