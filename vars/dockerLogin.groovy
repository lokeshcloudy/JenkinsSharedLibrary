#!/usr/bin/env groovy

def call(String cred) {
    echo 'Testing the Image'
    withCredentials([usernamePassword(credentialsId: "${cred}", passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "echo ${PASS} | docker login -u ${USER} --password-stdin"
    }
}