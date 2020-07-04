pipeline{
   agent any 
   tools {
        maven: 'Maven' 
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