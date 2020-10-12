pipeline {
    agent any

    tools {
        maven 'Maven-3.6.3'
    }

    environment {
        JAR_FILENAME = "hello-jenkins"
        JAR_VERSION = "1.0-SNAPSHOT"
        PARAM1 = "Shyam Sundar"
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
                sh "java -cp target/${JAR_FILENAME}-${JAR_VERSION}.jar com.sapient.Main \"${PARAM1}\""
            }
        }
    }
    post {
        always {
            echo "This will always be executed"
        }
        success {
            echo "This will be executed only when all stages succeed"
        }
        failure {
            echo "This will be executed whenever any stage fails"
        }
    }
}