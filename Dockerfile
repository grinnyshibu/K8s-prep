FROM java:8
ADD target/k8s-0.0.1-SNAPSHOT.jar k8s.jar
ENTRYPOINT ["java","-jar","k8s.jar"]
