pipeline {  
agent any
stages {
    stage('Preperation') { 
     steps{
       
    withMaven(
        // Maven installation declared in the Jenkins "Global Tool Configuration"
        maven: 'MAVEN_HOME'
        
        ) {

      // Run the maven build
      sh "mvn clean"

    } 

     
     }
       
    }
    stage('Build') { 
    steps{
         withMaven(
        // Maven installation declared in the Jenkins "Global Tool Configuration"
        maven: 'MAVEN_HOME'
        
        ) {

      // Run the maven build
      sh "mvn test"

    } 
        }
    }
    stage('Package') { 
    steps{
         withMaven(
        // Maven installation declared in the Jenkins "Global Tool Configuration"
        maven: 'MAVEN_HOME'
        
        ) {

      // Run the maven build
      sh "mvn package"

    } 
    }
}
}
