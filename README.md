# Getting Started

Simple REST backend with Spring Boot 2.6.4 and Java 17 to demonstrate:  
- Spring Data Rest  
- JPA  
- H2  
- Hal Explorer
- Swagger UI (Springdoc)
- Hibernate Validator  
- Lombok  
- Database loader  

Instructions:  

1. Build it with Maven from within the root of this project:  
mvn clean install  
or with the Maven wrapper:  
mvnw clean install  
 
2. Then run:  
java -jar target/restapp-1.0.jar

3. Start the Hal Explorer:  
URL: http://localhost:8080

4. Start Swagger UI:  
URL: http://localhost:8080/swagger-ui.html 

5. Start the H2 console:  
URL: http://localhost:8080/h2-console  
JDBC URL: jdbc:h2:mem:testdb  
Username: sa  
Leave password empty
