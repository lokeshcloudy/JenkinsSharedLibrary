#!/usr/bin/env groovy

def call(String package) {
    echo "Building the Application..."
    sh "${package}"
}