#!/usr/bin/env groovy

def call(String imageName) {
    echo 'Building The Image....'
    sh "docker build -t ${imageName}/${GIT_BRANCH.split("/)[1]}:${BUILD_ID} ."
}
