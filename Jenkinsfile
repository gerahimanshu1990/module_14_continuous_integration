node {
    stage('Build') {
       sh 'mvn install'
    }

    stage('Archive') {
        archiveArtifacts 'target/surefire-reports/emailable-report.html'
    }

    stage('email Report') {
        emailext subject: 'Jenkins Multibranch Report',
            attachLog: true,
            body: 'PFA the Logs',
            from: 'gera.himanshu1990@gmail.com',
            to: 'gera.himanshu1990@gmail.com'
    }
}
