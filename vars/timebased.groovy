def call(String agentLabel, Closure body) {

    def hour = new Date().format(
        'HH',
        TimeZone.getTimeZone('Asia/Kolkata')
    ) as int

    echo "Current Hour (IST): ${hour}"

    if (hour >= 9 && hour < 18) {
        echo "Running on assigned node: ${agentLabel}"

        node(agentLabel) {
            body()
        }
    } else {
        echo "Running on master node: built-in"

        node('built-in') {
            body()
        }
    }
}
