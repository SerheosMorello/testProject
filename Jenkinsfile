pipeline {
    agent any
	
	stages {
		stage('Clean') {
			steps {
				sh 'mvn clean'
			}
		}
		stage('Compile') {
			steps {
				sh 'mvn compile'
			}
		}
		stage ('Test'){
			parallel {

				stage('Test chrome') {
					steps {
						sh 'mvn test -Dtest=CIMSmokeTest -Dselenide.browser=chrome'
						junit "**/*.xml"
					}

				}
				stage('Test firefox') {
					steps {
						 sh 'mvn test -Dtest=CIMSmokeTest -Dselenide.browser=firefox'
						 junit "**/*.xml"
					}
				}
			}
		}
	}
}
