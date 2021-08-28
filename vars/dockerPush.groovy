#!/usr/bin/env groovy

def call() {
    echo 'Pushing The Docker Image'
    sh 'docker push lokeshlish/jar_application:1.0.0.'
}