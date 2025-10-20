#!/bin/bash

find ./src/main/ -type f -name "*.java" >sources.txt

javac -d ./out/ @sources.txt

java -cp ./out/ com.mycompany.app.App
