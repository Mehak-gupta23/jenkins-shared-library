def call() {
    parallel(
        "Maven Compile": {
            echo "Compiling project through Maven"
            sh 'mvn compile || true'
        },
        "Maven Test": {
            echo "Running tests through Maven"
            sh 'mvn test || true'
        }
    )
}
