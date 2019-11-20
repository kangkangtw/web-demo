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
                sh "ansible ubuntuAnsible -m copy -a 'src=target/web-demo-0.0.1-SNAPSHOT.jar dest=/home/docker/ owner=docker group=docker mode=0755'"
                sh "ansible ubuntuAnsible -m command -a 'java -jar /home/docker/web-demo-0.0.1-SNAPSHOT.jar'"
            }
        }
    }
}