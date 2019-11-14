pipeline {
    agent none
    stages {
        stage("Compile") {
            steps {
                echo "Compile"
                script {
                    checkout scm
                    echo ${WORKSPACE}
                    def project_name = "web-demo"
                    def build_package_name = "web-demo-1.0.0-SNAPSHOT.jar"

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