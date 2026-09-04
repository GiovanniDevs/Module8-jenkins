def buildJar() {
    echo 'building the application...'
    sh 'mvn package'
}

def buildImage() {
    echo 'building the docker image...'
    sh 'docker build -t giovannidevs/demo-app:jma-1.0 .'
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]){
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push giovannidevs/demo-app:jma-1.0'
    }   
}


def deployApp() {
    echo 'Deploying the application...'
    
}


return this 
