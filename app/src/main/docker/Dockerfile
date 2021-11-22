FROM adoptopenjdk/openjdk11
COPY autoramp-*.jar autoramp.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/autoramp.jar"]