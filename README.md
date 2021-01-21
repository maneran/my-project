# my-project
Demo project using Dockerfile and Jenkinsfile

README.md
build the project
./mvnw build
build Docker image called java-app. Execute from root
docker build -t java-app .
push image to repo
docker tag java-app demo-app:java-1.0
