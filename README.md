# reactathon-server
Basic Spring Boot server to be used with the 'reactathon' training/hackathon.

## Running the JAR:

`java -jar crypto-api-rest-0.1.0.jar`

Once the server is up and running it can be accessed on port **8080**


## Building and Running the API with Maven

`mvn spring-boot:run`

or

```
mvn  clean package
java -jar target/crypto-api-rest-0.1.0.jar
```

## Database

The API runs against a local H2 databased stored at:

Once the application is running you can access the H2 console at:

`http://localhost:8080/h2/login.jsp`


## End Points:

### Account:

#### Login:

GET `/account/login`

#### Account Creation:

POST `/account/create`

Request Body:

```
{
"username": "jinx",
"password": "kittyCat"
}
```
