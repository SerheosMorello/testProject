pipeline {
    agent any

    stages {
        stage('Check version') {
            steps {
               bat 'mvn -version'
            }
        }
        stage('Build') {
            steps {
               bat 'mvn compile'
            }
        }
        stage('Test') {
            steps {
               bat 'mvn test'
            }
        }
    }
}