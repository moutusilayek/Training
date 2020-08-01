pipeline {  
agent any
stages {
    stage('Preperation') { 
     steps{
        sh "mvn clean"
     }
       
    }
    stage('Build') { 
    steps{
        sh "mvn test"
        }
    }
    stage('Package') { 
    steps{
        sh "mvn package"
        }
    }
}
}
