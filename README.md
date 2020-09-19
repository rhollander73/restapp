# Getting Started

Simple REST backend with Spring Boot and Java 11 to demonstrate:  
- Spring Data Rest  
- JPA  
- H2  
- Hal Explorer  
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

4. Start the H2 console:  
URL: http://localhost:8080/h2-console  
JDBC URL: jdbc:h2:mem:testdb  
Username: sa  
Leave password empty
