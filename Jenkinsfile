pipeline {
    agent any

    tools {
        maven 'Maven 3.8.5'  // Set in Jenkins: Manage Jenkins > Global Tool Configuration
        jdk 'JDK 21'         // Set your installed JDK name here
    }

    environment {
        JAVA_HOME = "${tool 'JDK 21'}"
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Clone Code') {
            steps {
                git 'https://github.com/your-username/your-repo.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Run App') {
            steps {
                sh 'java -jar target/*.jar'
            }
        }
    }
}
