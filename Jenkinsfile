pipeline {
    agent none
    stages {
        stage("Compile") {
            steps {
                echo "Compile"
                echo ${WORKSPACE}
                script {
                    checkout scm
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