#!/usr/bin/env groovy

def call(String imageName) {
    echo 'Pushing The Docker Image'
    sh "docker push ${imageName}/${env.BRANCH_NAME}:${BUILD_ID}"
}
