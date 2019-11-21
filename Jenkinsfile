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
                sh "ansible ubuntuAnsible -m copy -a 'src=target/web-demo-0.0.1-SNAPSHOT.jar dest=/home/docker/ owner=docker group=root mode=0755'"
                sh "ansible ubuntuAnsible -m script -a 'startApp.sh'"
                sleep 10

                timeout(time: 30, unit: 'SECONDS') {
                    retry(3) {
                        result = sh returnStdout: true ,script: "ansible ubuntuAnsible -m command -a 'curl localhost:9090'"
                        println(result);
                    }
                }
            }
        }
    }
}