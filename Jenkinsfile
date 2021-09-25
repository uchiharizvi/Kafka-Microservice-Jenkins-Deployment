pipeline{
    agent any
    stages{
        stage ('build'){
        steps{
            withMaven(maven: 'maven_3.8.2'){
                sh 'mvn clean compile'
            }
        }
    }
    stage ('Test'){
            steps{
                withMaven(maven: 'maven_3.8.2'){
                    sh 'mvn test'
                }
            }
        }
    stage('deploy'){
            steps{
                withMaven(maven: 'maven_3.8.2'){
                    sh 'mvn deploy'
                }
            }
        }
    }
}
