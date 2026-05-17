def call() {
    parallel(
        "Maven Compile": {
            echo "Compiling project"
            sh 'mvn clean compile'
        },
        "Maven Test": {
            echo "Running unit tests"
            sh 'mvn test'
        },
        "Checkstyle": {
            echo "Running checkstyle"
            sh 'mvn checkstyle:check || true'
        }
    )
}
