@echo off

REM set CLASSPATH=%JUNIT_HOME%;%JUNIT_HOME%/junit-4.10.jar;%TARGET_FOLDER%;%ALL_JARS%
REM set JUNIT_HOME=C:\junit4.10
REM set CLASSPATH=%JUNIT_HOME%;%JUNIT_HOME%/junit-4.10.jar;D:\dev\Java\unittest01
REM set CLASSPATH=c:\A\junit-4.4.jar;c:\B\test_classes;c:\B\target_classes;c:\D\3rd_party.jar

REM set CLASSPATH=%JUNIT_HOME%;%JUNIT_HOME%/junit-4.10.jar

:COMPILE
REM javac -cp "%JUNIT_HOME%/junit-4.10.jar;." HelloWorldTest.java

javac -sourcepath src -d build\classes src\oata\HelloWorld.java

echo -------------------------------------
echo Compile complete.


:RUN

java -cp build\classes oata.HelloWorld



:RUN_TEST
REMjava -cp "%JUNIT_HOME%/junit-4.10.jar;." org.junit.runner.JUnitCore HelloWorldTest
