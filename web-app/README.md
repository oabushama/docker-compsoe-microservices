### Building the Container Image

```bash
$ docker build -t my-web-app .
```

### Running the Docker Container

```bash
$ docker run -it --name my-web-app-container -p 127.0.0.1:8080:80 my-web-app
```
