#!/usr/bin/env groovy

def call(String imageName) {
    echo 'Building The Image....'
    sh "docker build -t ${imageName}/${GIT_BRANCH}:${BUILD_ID} ."
}
