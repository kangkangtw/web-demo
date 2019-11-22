pipeline {
    agent any
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
                timeout(time: 30, unit: 'MINUTES') {
                    input message: 'Deploy this version?'
                }
                script {
                    sh "ansible ubuntuAnsible -m copy -a 'src=target/web-demo-0.0.1-SNAPSHOT.jar dest=/home/docker/ owner=docker group=root mode=0755'"
                    sh "ansible ubuntuAnsible -m script -a 'startApp.sh'"
                    sleep 10
                    timeout(time: 30, unit: 'SECONDS') {
                        def result = sh returnStdout: true, script: "ansible ubuntuAnsible -m command -a 'curl localhost:9090'"
                        if (result.contains("Hello World")) {
                            println("Success")
                        } else {
                            throw new Exception()
                        }
                    }
                }
            }
        }
    }
    post {
        success{
            script{
                echo 'Post Success'
            }
        }
    }
}