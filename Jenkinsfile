pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat(script: 'mvn clean install', returnStatus: true)
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts 'target/surefire-reports/emailable-report.html'
            }
        }

        stage('email Report') {
            steps {
                emailext subject: 'Jenkins Multibranch Report using Declarative Pipeline',
                    attachLog: true,
                    body: 'PFA the Logs',
                    from: 'gera.himanshu1990@gmail.com',
                    to: 'gera.himanshu1990@gmail.com'
            }
        }
    }
}
