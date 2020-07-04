pipeline{
   agent any 
   stages {
   
   	stage('Compile Stage'){
   		steps{
   			withMaven(maven: 'maven_3_5_0'){
   				sh 'mvn clean install'
   			}
   		}
   	}
   	stage('Test Stage'){
   		steps{
   			withMaven(maven: 'maven_3_5_0'){
   				sh 'mvn test'
   			}
   		}
   	}
   	stage('Cucumber Report'){
   		steps{
   			cucumber buildStatus: "UNSTABLE",
   			fileIncludePatter: "**/cucumber.json",
   			jsonReportDirectory: 'target'
   		}
   	 }
   }
}