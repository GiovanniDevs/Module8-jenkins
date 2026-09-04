def gv
pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }

    stages {
        stage('build jar') {
            steps {
                script{
                    echo 'building the application...'
                    sh 'mvn package'
                    
                }     
                
            }
        }
        stage('build jimage') {
            steps {
                script{
                    echo 'building the docker image...'
                    withCredentials([usernamePassword(credentialsID: 'dockerhub-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]){
                        sh 'docker build -t giovannidevs/demo-app:jma-1.0 .'
                        sh 'echo $PASS | docker login -u $USER --password-stdin'
                        sh 'docker push giovannidevs/demo-app:jma-1.0'

                    }
                    
                }     
                
            }
        }
        stage('Build') {
            steps {
                script{
                    echo "deploying the application..."
                }
                
            }
            
        }
    }
}
