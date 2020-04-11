pipeline {
    agent any

    stages {
        stage('autograding') {
            steps {
                publishCoverage adapters: [jacocoAdapter('jacoco.xml')], sourceFileResolver: sourceFiles('NEVER_STORE')
            }
        }
    }
}
