pipeline {  
agent any
stages {
    stage('Preperation') { 
     steps{
         export MAVEN_HOME=/opt/maven
         export PATH=$PATH:$MAVEN_HOME/bin
        sh "mvn clean"
     }
       
    }
    stage('Build') { 
    steps{
        export MAVEN_HOME=/opt/maven
        export PATH=$PATH:$MAVEN_HOME/bin
        sh "mvn test"
        }
    }
    stage('Package') { 
    steps{
        export MAVEN_HOME=/opt/maven
        export PATH=$PATH:$MAVEN_HOME/bin
        sh "mvn package"
        }
    }
}
}
