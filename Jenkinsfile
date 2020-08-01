pipeline {  
agent any
stages {
    stage('Preperation') { 
     steps{
         withMaven(
        // Maven installation declared in the Jenkins "Global Tool Configuration"
        maven: 'MAVEN_HOME',
        
      sh "mvn clean"

    } 
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
