FROM python:3-alpine
RUN mkdir /app
COPY ["./requirements.txt", "./best-sellers.py", "/app"]
WORKDIR /app
RUN pip install -r requirements.txt
EXPOSE 3000
CMD ["python", "best-sellers.py"]
