### Building and Running 

To build the container image and run the Docker container, run:
```bash
$ docker build -t my-web-app .
$ docker run -dit --name my-web-app-container -v $(pwd)public-html:/usr/local/apache2/htdocs/ -p 8080:80 my-web-app
```
