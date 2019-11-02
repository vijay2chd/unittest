pipeline {
  agent any

  stages {
    stage('Compile') {
       steps {
	        sh "mvn compile"
       }
    }

    stage('Build') {
	     steps {
          sh "mvn package"
	     }
    }

    stage('Install') {
	     steps {
          sh 'mvn install'
	     }
    }

    stage('Archieve') {
        steps {
           archiveArtifacts 'target/*.jar'
        }
    }

    stage('FingerPrint') {
        steps {
           fingerprint 'target/*.jar'
        }
    }

    stage('Notify') {
        steps {
        mail bcc: '', body: '''Please check the build "Shoppingcart" in Jenkins. It failed!

        Team Jenkins
        ''', cc: '', from: '', replyTo: '', subject: 'Build has failed. Please check', to: 'basil1987@gmail.com'
        }
    }

  }

}
