pipeline {
    agent any

    stages {
        stage('Check version') {
            steps {
                "mvn -version"
            }
        }
        stage('Build') {
            steps {
                "mvn compile"
            }
        }
        stage('Test') {
            steps {
                "mvn test"
            }
        }
    }
}