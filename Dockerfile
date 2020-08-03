FROM tomcat:9.0-alpine

ADD /tryout/target/tryout-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/

EXPOSE 4322


ENTRYPOINT ["java", "-jar","/usr/local/tomcat/webapps/tryout-0.0.1-SNAPSHOT.jar"]
