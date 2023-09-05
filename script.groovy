def buildApp() {
    echo 'Building the Application....'
}

def testApp() {
    echo 'testing the application....'
}

def deployApp() {
    echo "deploying the app...."
    echo "deploying version ${params.version}"
}
return this
