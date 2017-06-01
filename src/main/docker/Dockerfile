FROM gcr.io/google_appengine/openjdk
VOLUME /tmp
ADD gcloud-docker-spring-boot-jpa-starter-1.0.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "java", "-jar", "/app.jar" ]