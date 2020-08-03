FROM tomcat:9.0-alpine

ADD StoreExclusionAPI.zip_expanded/StoreExclusionAPI/target/StoreExclusionAPI-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/

EXPOSE 4322


ENTRYPOINT ["java", "-jar","/usr/local/tomcat/webapps/StoreExclusionAPI-0.0.1-SNAPSHOT.jar"]
