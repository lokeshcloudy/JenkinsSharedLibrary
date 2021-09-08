#!/usr/bin/env groovy

def call(String imageName) {
    echo 'Pushing The Docker Image'
    sh "docker push ${imageName}:${BUILD_ID}"
}
