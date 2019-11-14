pipeline {
    agent none
    stages {
        stage("Compile") {
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
            steps {
                echo "Deploy"
            }
        }
    }
}