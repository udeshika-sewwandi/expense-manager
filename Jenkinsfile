pipeline {
    agent any
    tools {
        maven 'maven-3.8.6'
    }
    stages {
        stage("Checkout the code") {
            steps {
                git branch: '**', url: 'https://github.com/udeshika-sewwandi/expense-manager.git'
            }
        }
        stage ("Build the project") {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
