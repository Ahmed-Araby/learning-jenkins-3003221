pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'echo "Hello World"'
                bat 'mvn install'
                bat 'java -cp target/hello-1.0-SNAPSHOT.jar com.learningjenkins.App'
            }
        }
    }
}
