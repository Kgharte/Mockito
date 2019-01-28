FROM openjdk:11.0-jdk

ADD ./target/Muzix-0.0.1-SNAPSHOT.jar /muzix/app/Muzix-0.0.1-SNAPSHOT.jar

WORKDIR muzix/app

ENTRYPOINT ["java","-jar","Muzix-0.0.1-SNAPSHOT.jar"]