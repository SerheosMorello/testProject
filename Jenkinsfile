pipeline {
    agent any

    stages {
        stage('Git clone') {
            steps {
               sh 'git clone https://github.com/SerheosMorello/testProject.git'
            }
        }
        stage('Build') {
            steps {
               sh 'mvn compile'
            }
        }
        stage('Test') {
            steps {
               sh 'mvn test'
            }
        }
    }
}