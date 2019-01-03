@echo off

set JAVA_SRC_FILE=fizzbuzz
REM
REM set CLASSPATH=%JUNIT_HOME%;%JUNIT_HOME%/junit-4.10.jar;%TARGET_FOLDER%;
REM set CLASSPATH=%JUNIT_HOME%;%JUNIT_HOME%/junit-4.10.jar;%TARGET_FOLDER%;%ALL_JARS%
REM set JUNIT_HOME=C:\junit4.10
REM set CLASSPATH=%JUNIT_HOME%;%JUNIT_HOME%/junit-4.10.jar;D:\dev\Java\unittest01
REM set CLASSPATH=%JUNIT_HOME%;%JUNIT_HOME%/junit-4.10.jar;D:\dev\Java\unittest01\TestRunner;D:\dev\Java\unittest01\TestJunit;D:\dev\Java\unittest01\JunitRunner;D:\dev\Java\unittest01\AssertionsTest

REM set CLASSPATH=c:\A\junit-4.4.jar;c:\B\test_classes;c:\B\target_classes;c:\D\3rd_party.jar

:COMPILE
REM javac -cp "%JUNIT_HOME%/junit-4.10.jar;." AssertionsTest.java JunitRunner.java

echo          Compile....

javac %JAVA_SRC_FILE%.java

REM echo -------------------------------------
echo          Compile complete.
echo          Run:
echo -------------------------------------

:RUN
java %JAVA_SRC_FILE%
