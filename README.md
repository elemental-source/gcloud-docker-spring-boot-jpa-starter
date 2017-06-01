## Java project Spring-Boot with Google App Engine (Google Cloud Platform)

# Tecnologies

- Java 8
- Spring-boot
- Spring-Web
- Spring-Data-JPA
- Embedded Tomcat
- App Engine
- Cloud SQL
- Docker

# Instructions
    Before run project, create Google Cloud Platform Free-Trial account
[Google Cloud Platform Free-Trial](https://cloud.google.com/free/)

    Create new project Google Developer Apis Console
[Google Developer Apis Console](https://console.developers.google.com/apis)

    Create Cloud SQL (Mysql) Instance
[Google Cloud SQL Page](https://console.cloud.google.com/sql/instances)

-----------------------------------------------------------------------
#### Clone and build project

```shell
git clone https://github.com/elemental-source/gcloud-docker-spring-boot-jpa-starter.git
cd gcloud-docker-spring-boot-jpa-starter
./gradlew clean build
```

#### Download GCloud SDK

[Google Cloud SDK Client Download](https://cloud.google.com/sdk/downloads)

#### Configure Google Account Project

[Quickstart for Java in the App Engine Flexible Environment](https://cloud.google.com/java/getting-started/hello-world)

```sh

gcloud config set project YOUR_PROJECT_ID
./gradlew appengineDeploy
```

### Test

GET -> https://PROJECT_ID.appspot.com/api/user