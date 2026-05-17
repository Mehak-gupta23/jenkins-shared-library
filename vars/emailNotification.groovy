def call(String status, String email) {
    mail(
        to: email,
        subject: "Build ${status}: ${env.JOB_NAME}",
        body: "Build ${status}\nJob: ${env.JOB_NAME}\nBuild: ${env.BUILD_NUMBER}\nURL: ${env.BUILD_URL}"
    )
}
