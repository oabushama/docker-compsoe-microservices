## A simple Java Spring RESTful Web Service

An example order shipping status RESTful API in Java using the Spring framework.

### Dependency
- JDK 1.8 or later
- [Maven](https://maven.apache.org/) 3.2+

### Building

#### To build and run via Docker:

```bash
docker build -t product-shipping-service:latest .
docker run -d -p 9000:5000 product-search-service:latest
```

To use the API:

```bash
$ curl http://127.0.0.1:9000/shipping?id=12345
```

#### To build and run the app from source without Docker, run:

```bash
$ mvn package
$ java -jar target/product-shipping-service-0.1.0.jar
```

To use the API:

```bash
$ curl http://127.0.0.1:5000/shipping?id=12345
```

### Usage
Send an HTTP request to the shipping/ end point with an id parameter as shown above.

You should receive a response in JSON like:

```json
{ "id":123456,
  "content":"Samsung Galaxy S9 Plus",
  "status":"shipped"
}
```

### License
MIT
