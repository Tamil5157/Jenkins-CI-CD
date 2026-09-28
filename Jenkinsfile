pipeline {
    agent any
 
    stages {
 
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Tamil5157/Jenkins-CI-CD.git'
            }
        }
 
        stage('Build') {
            steps {
                bat 'javac Jenkins.java'
            }
        }
 
        stage('Docker Build') {
            steps {
                bat 'docker build -t jenkins-demo .'
            }
        }
 
        stage('Docker Run') {
            steps {
                bat 'docker run --rm -d -p 8081:8081 jenkins-demo'
            }
        }
    }
}