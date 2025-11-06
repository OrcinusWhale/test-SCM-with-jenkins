def buildapp() {
    echo "Building branch ${params.BRANCH_VERSION}..."
}
def testapp() {
    echo "Testing branch ${params.BRANCH_VERSION}..."
}
def deployapp() {
    echo "Deploying branch ${params.BRANCH_VERSION}..."
}

return this