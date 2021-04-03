./gradlew build
docker rmi wjdrbs96/test:1.0.1
docker build --tag wjdrbs96/test:1.0.1 . && docker push wjdrbs96/test:1.0.1