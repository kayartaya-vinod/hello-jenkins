pipeline {
    agent any

    tools {
        maven 'Maven-3.6.3'
    }

    stages {
        stage("Test") {
            steps {
                sh "mvn clean test"
            }
        }

        stage("Build") {
            steps {
                sh "mvn package -DskipTests"
            }
        }

        stage("Execute Main class") {
            steps {
                sh "java -cp target/hello-jenkins-1.0-SNAPSHOT.jar com.sapient.Main \"Vinod Kumar\""
            }
        }

    }
}