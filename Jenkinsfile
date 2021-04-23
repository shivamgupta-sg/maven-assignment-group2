pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bash 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bash 'mvn test'
            }
        }
    }
}
