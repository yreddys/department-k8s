FROM openjdk:17
EXPOSE 8080
ADD target/Department.jar Department.jar
ENTRYPOINT ["java","-jar","/Department.jar"]



 