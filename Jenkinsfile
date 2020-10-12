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
            junit '**/*xml'
            jacoco execPattern: '**/jacoco.exec', sourceExclusionPattern: '**/Main.java'
            archiveArtifacts artifacts: "target/${JAR_FILENAME}-${JAR_VERSION}.jar", followSymlinks: false
            deleteDir()
        }
        failure {
            echo "This will be executed whenever any stage fails"
//             mail to: 'vinod@knowledgeworksindia.com',
//                 subject: 'Failed stage in Pipeline ${currentBuild.fullDisplayName}',
//                 body: 'Something went wrong during build.'
        }
    }
}