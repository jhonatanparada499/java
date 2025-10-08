#!/bin/bash

# Compile source files to bin directory
javac src/*.java -d bin/

# cd into bin
cd bin

# Run app
java App

# Go back to project directory
cd ..
