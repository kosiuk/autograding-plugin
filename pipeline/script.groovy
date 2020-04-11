pipeline {
    agent any

    stages {
        stage('autograding') {
            steps {
                publishCoverage adapters: [jacocoAdapter('pipeline/jacoco.xml')], sourceFileResolver: sourceFiles('NEVER_STORE')
                junit ''
                step([$class: 'PitPublisher', mutationStatsFile: 'pipeline/mutations.xml'])
                recordIssues(tools: [checkStyle()])
            }
        }
    }
}
