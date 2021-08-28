#!/usr/bin/env groovy

def call() {
    echo 'Building The Image....'
    sh 'docker build -t lokeshlish/jar_application:1.0.0. .'
}
