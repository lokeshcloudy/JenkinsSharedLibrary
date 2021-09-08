#!/usr/bin/env groovy

def call(String imageName) {
    echo 'Building The Image....'
    sh "docker build -t ${imageName}/adservice:${BUILD_ID} ."
}
