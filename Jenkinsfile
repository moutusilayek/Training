pipeline {  
agent any
stages {
    stage('Preperation') { 
     steps{
         export MAVEN_HOME=/opt/maven
         sh "mvn -f /opt/maven"
        sh "mvn clean"
     }
       
    }
    stage('Build') { 
    steps{
        export MAVEN_HOME=/opt/maven
        
        sh "mvn test"
        }
    }
    stage('Package') { 
    steps{
        export MAVEN_HOME=/opt/maven
        
        sh "mvn package"
        }
    }
}
}
