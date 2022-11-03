## Top sellers Microservice

### Usage

To run it directly using Python's virtual environment:

```bash
## Install virtual env
pip3 install virtualenv
python3 -m venv myenv
source ./myenv/bin/activate
# Install dependencies
pip3 install -r requirements.txt
python3 best-sellers.py
# Test the API using curl
curl http://localhost:3000/best-sellers
# To Quit CTRL-C and run
deactivate
```

To run it via Docker:

```bash
docker build -t best-sellers-service:latest .
docker run -d -p 10000:3000 best-sellers-service:latest
```
