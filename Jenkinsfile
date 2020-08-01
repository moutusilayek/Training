pipeline {  
agent any
stages {
    stage('Preperation') { 
     steps{
       
    withMaven(
        // Maven installation declared in the Jenkins "Global Tool Configuration"
        maven: 'MAVEN_HOME'
        // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
        // We recommend to define Maven settings.xml globally at the folder level using 
        // navigating to the folder configuration in the section "Pipeline Maven Configuration / Override global Maven configuration"
        // or globally to the entire master navigating to  "Manage Jenkins / Global Tools Configuration"
        ) {

      // Run the maven build
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
