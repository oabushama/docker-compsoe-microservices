## A simple Java Spring RESTful Web Service

A simple product search RESTful API in Java using the Spring framework.

### Dependency
- JDK 1.8 or later
- [Maven](https://maven.apache.org/) 3.2+

### Building

#### To build and run via Docker:

```bash
docker build -t product-search-service:latest .
docker run -d -p 8000:5000 product-search-service:latest
```
To use the API:

```bash
$ curl http://localhost:8000/product?name=Espresso%20Machine
```

#### To build and run the app from source without Docker, run:

```bash
$ mvn package
$ java -jar target/product-search-api-0.1.0.jar
```

To use the API:

```bash
$ curl http://localhost:5000/product?name=Espresso%20Machine
```

### Running



### Usage
Send an HTTP request to the product/ end point with a name parameter as shown above.

You should receive a response in JSON like:

```json
{ "id":1,
  "name": "Espresso Machine",
  "price": 158.1
}
```


If you wish to change the host and port number, edit `src/main/resources/application.properties`


### License
MIT
