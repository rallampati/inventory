FROM openjdk:8
MAINTAINER ram
VOLUME /tmp
ADD target/inventory-0.0.1-SNAPSHOT.jar /
#RUN bash -c 'touch /docker-jenkins.jar'
ENTRYPOINT ["java","-Xms512m", "-Xmx2048m", "-jar", "/inventory-0.0.1-SNAPSHOT.jar"]