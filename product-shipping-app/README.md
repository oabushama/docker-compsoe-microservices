## A simple Java Spring RESTful Web Service

An example order shipping status RESTful API in Java using the Spring framework.

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
$ java -jar target/product-shipping-service-0.1.0.jar
$ curl http://0.0.0.0:5000/shipping?id=12345
```
You should receive a response in JSON like:

```json
{ "id":123456,
  "content":"Samsung Galaxy S9 Plus",
  "status":"shipped"
}
```

### License
MIT
