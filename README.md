## Docker Compose
This is an example that shows how to use Docker Compose to set up, package, and run a  microservice-based, multi-container Java Spring application

### Dependency
- JDK 1.8 or later
- [Maven](https://maven.apache.org/) 3.2+

## Build
Build the binary (jar) file for each service

```bash
$ cd product-search-app/
$ mvn package
$ cd ../product-shipping-app/
$ mvn package
$ cd ..
```

## Running
Create and start the containers for our services

```bash
docker-compose up
```

# License
MIT
