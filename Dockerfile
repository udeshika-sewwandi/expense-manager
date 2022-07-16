FROM openjdk:11

COPY target/expense-manager-0.0.1-SNAPSHOT.jar expense-manager-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "expense-manager-0.0.1-SNAPSHOT.jar"]