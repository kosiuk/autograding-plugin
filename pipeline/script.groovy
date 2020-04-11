pipeline {
    agent any

    stages {
        stage('autograding') {
            steps {
                publishCoverage adapters: [jacocoAdapter('pipeline/jacoco.xml')], sourceFileResolver: sourceFiles('NEVER_STORE')
                // sh label: '', script: 'touch pipeline/junit-testResults/*'
                // junit testResults: 'pipeline/junit-testResults/TEST-*.xml'
                // step([$class: 'PitPublisher', mutationStatsFile: 'pipeline/mutations.xml'])
                // recordIssues(tools: [checkStyle()])
                // autoGrade('{"analysis":{"maxScore":100,"errorImpact":-10,"highImpact":-5,"normalImpact":-2,"lowImpact":-1}, "tests":{"maxScore":100,"passedImpact":1,"failureImpact":-5,"skippedImpact":-1}, "coverage":{"maxScore":100,"coveredImpact":1,"missedImpact":-1}, "pit":{"maxScore":100,"detectedImpact":1,"undetectedImpact":-1,"ratioImpact":0}}')
            }
        }
    }
}
