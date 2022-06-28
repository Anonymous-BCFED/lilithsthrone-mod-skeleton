:: This turns into res/mods/$MODAUTHORID/
set MODAUTHORID=authorname

:: Pull this from pom.xml
set JARNAME=skeleton
set JARVERSION=0.0.1-SNAPSHOT

:: Clean up old builds
rmdir /S /Q dist

:: Build the plugin
mvn clean package

mkdir dist\res\mods\%MODAUTHORID%\plugins
xcopy /S /I /E res dist\res\mods\%MODAUTHORID%
set JARWITHDEPS="target\%JARNAME%-%JARVERSION%-jar-with-dependencies.jar"
set JARWITHOUTDEPS="target\%JARNAME%-%JARVERSION%.jar"
if exists %JARWITHDEPS% (
    copy /Y %JARWITHDEPS% dist\res\mods\%MODAUTHORID%\plugins\%JARNAME%.jar
) else (
    copy /Y %JARWITHOUTDEPS% dist\res\mods\%MODAUTHORID%\plugins\%JARNAME%.jar
)
copy /Y LICENSE dist\res\mods\%MODAUTHORID%\LICENSE