pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
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
