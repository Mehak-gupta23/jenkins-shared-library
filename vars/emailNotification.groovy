def call(String status, String email) {
    emailext(
        subject: "Build ${status}: ${env.JOB_NAME}",
        body: "Build ${status}\nJob: ${env.JOB_NAME}\nBuild: ${env.BUILD_NUMBER}\nURL: ${env.BUILD_URL}",
        to: email
    )
}
