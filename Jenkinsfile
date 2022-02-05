pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                sh 'mvn install'
                sh 'java -cp target/hello-1.0-SNAPSHOT.jar com.learningjenkins.App'
            }
        }
    }
}
