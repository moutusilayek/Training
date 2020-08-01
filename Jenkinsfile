pipeline {  
agent any
stages {
    stage('Preperation') { 
     steps{
        bat "mvn clean"
     }
       
    }
    stage('Build') { 
    steps{
        bat "mvn test"
        }
    }
    stage('Package') { 
    steps{
        bat "mvn package"
        }
    }
}
}
