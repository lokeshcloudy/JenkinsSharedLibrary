#!/usr/bin/env groovy

def call(String imageName) {
    echo 'Building The Image....'
    sh "docker build -t ${imageName}/${env.BRANCH_NAME}:${BUILD_ID} ."
}
