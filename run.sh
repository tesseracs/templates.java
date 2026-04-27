#!/bin/sh
set -e
mkdir -p out
javac -d out src/main/java/com/tesseracs/template/*.java
java -cp out com.tesseracs.template.Main
