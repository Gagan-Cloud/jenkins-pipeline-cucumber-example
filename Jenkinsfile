pipeline{
   agent any 
   tools {
   		maven 'maven_3_5_3'
   }
   stages {
   	stage('Compile Stage'){
   		steps{
   			sh 'mvn clean install'
   		}
   	}
   	stage('Test Stage'){
   		steps{
   			sh 'mvn test'
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