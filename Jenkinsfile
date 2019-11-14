pipeline {
    agent none
    stages {
        stage("Compile") {
            agent any
            steps {
                echo "Compile"
                script {
                    checkout scm
                    sh "mvn -f pom.xml clean install"
                }
            }
        }
        stage("Test") {
            steps {
                echo "Test"
            }
        }
        stage("Deploy") {
            agent any
            steps {
                echo "Deploy"
                sh "nohup java -jar target/web-demo-0.0.1-SNAPSHOT.jar & "
            }
        }
    }
}