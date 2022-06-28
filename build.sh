#!/bin/bash

# This turns into res/mods/$MODAUTHORID/
MODAUTHORID=authorname

# Pull this from pom.xml
JARNAME=skeleton
JARVERSION=0.0.1-SNAPSHOT

# Clean up old builds
rm -rf dist/

# Build the plugin
mvn clean package


mkdir -p dist/res/mods/${MODAUTHORID}/plugins
cp -rv res/* dist/res/mods/${MODAUTHORID}/
JARWITHDEPS="target/${JARNAME}-${JARVERSION}-jar-with-dependencies.jar"
JARWITHOUTDEPS="target/${JARNAME}-${JARVERSION}.jar"
if [ -f "$JARWITHDEPS" ]; then
    cp -v "$JARWITHDEPS" dist/res/mods/${MODAUTHORID}/plugins/${JARNAME}.jar
else
    cp -v "$JARWITHOUTDEPS" dist/res/mods/${MODAUTHORID}/plugins/${JARNAME}.jar
fi
cp -v LICENSE dist/res/mods/${MODAUTHORID}/LICENSE