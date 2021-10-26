## A simple Java Spring RESTful Web Service

A simple product search RESTful API in Java using the Spring framework.

### Dependency
- JDK 1.8 or later
- [Maven](https://maven.apache.org/) 3.2+

### Building

- If you wish to change the host and port number, edit `src/main/resources/application.properties`
- To build the app, run:   

```bash
$ mvn package
```

### Running

```bash
$ java -jar target/product-search-service-0.1.0.jar
$ curl http://0.0.0.0:5000/product?name=Espresso%20Machine
```
You should receive a response in JSON like:

```json
{ "id":1,
  "name": "Espresso Machine",
  "price": 158.1
}
```

### License
MIT
