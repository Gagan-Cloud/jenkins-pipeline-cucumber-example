pipeline{
   agent any 
   stages {
   
   	stage('Compile Stage'){
   		steps{
   			withMaven(maven: 'Maven'){
   				sh 'mvn clean install'
   			}
   		}
   	}
   	stage('Test Stage'){
   		steps{
   			withMaven(maven: 'Maven'){
   				sh 'mvn test'
   			}
   		}
   	}
   	stage('Cucumber Report'){
   		steps{
   			cucumber buildStatus: "UNSTABLE",
   			fileIncludePattern: "**/cucumber.json",
   			jsonReportDirectory: 'target'
   		}
   	 }
   }
}