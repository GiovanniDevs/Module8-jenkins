def buildApp() {
    echo 'building the applicaton...'
}

def testApp() {
    echo 'testing the applicaton...'
}

def deployApp() {
    echo 'Deploying the appllication...'
    echo "deploying version ${params.VERSION}"
}


return this 
