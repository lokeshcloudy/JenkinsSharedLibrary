#!/usr/bin/env groovy

def dockerLogin() {
    echo 'Testing the Image'
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "echo ${PASS} | docker login -u ${USER} --password-stdin"
    }
}