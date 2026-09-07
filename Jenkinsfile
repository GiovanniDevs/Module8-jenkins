#!/user/bin/env groovy

// library name from jenkins system settings
@Library('Jenkins-SL')

def gv

pipeline {
    agent any
    tools {
        maven 'maven-3.9'   // must match Manage Jenkins → Tools exactly
    }
    

    stages {
        stage('init') {
            steps {
                script {
                    gv = load "script.groovy"

                }
            }
        }
        stage('build jar') {
            steps {
                script {
                    buildJar 'giovannidevs/demo-app:jma-1.0'

                }
            }
        }
        stage('build image') {
            steps {
                script {
                    buildImage()

                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    gv.deployApp()
                }
                
            }
            
        }
    }
        
}