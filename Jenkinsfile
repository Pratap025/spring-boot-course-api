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
                git 'https://github.com/Pratap025/spring-boot-course-api'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Run App') {
            steps {
                bat 'java -jar target/Course_Management_Application-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
