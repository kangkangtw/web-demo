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
            }
            sleep 10

            timeout(time: 30, unit: 'SECONDS') {
                retry(3) {
                    def response = httpRequest url: "${appurl}", validResponseContent: 'Greetings from Spring Boot', validResponseCodes: '200'
                    println("Response Status: " + response.status)
                    println("Response Content: " + response.content)
                }
            }
        }
    }
}