@echo off

set CLASSPATH=%JUNIT_HOME%;%JUNIT_HOME%/junit-4.10.jar;%TARGET_FOLDER%;
REM set CLASSPATH=%JUNIT_HOME%;%JUNIT_HOME%/junit-4.10.jar;%TARGET_FOLDER%;%ALL_JARS%
REM set JUNIT_HOME=C:\junit4.10
REM set CLASSPATH=%JUNIT_HOME%;%JUNIT_HOME%/junit-4.10.jar;D:\dev\Java\unittest01
REM set CLASSPATH=%JUNIT_HOME%;%JUNIT_HOME%/junit-4.10.jar;D:\dev\Java\unittest01\TestRunner;D:\dev\Java\unittest01\TestJunit;D:\dev\Java\unittest01\JunitRunner;D:\dev\Java\unittest01\AssertionsTest

REM set CLASSPATH=c:\A\junit-4.4.jar;c:\B\test_classes;c:\B\target_classes;c:\D\3rd_party.jar

set cl

:COMPILE
REM javac -cp "%JUNIT_HOME%/junit-4.10.jar;." AssertionsTest.java JunitRunner.java

javac AssertionsTest.java JunitRunner.java

REM javac -classpath "C:\junit4.10\junit-4.10.jar";"C:\junit4.10\hamcrest-core-1.3.jar"; TestJunit.java TestRunner.java
REM ----javac -classpath "C:\junit4.10\junit-4.10.jar";"C:\junit4.10\hamcrest-core-1.3.jar"; AssertionsTest.java JunitRunner.java 
REM javac -classpath "C:\junit4.10\junit-4.10.jar";"C:\junit4.10\hamcrest-core-1.3.jar"; TestJunit.java 
REM javac -classpath "C:\junit4.10\junit-4.10.jar";"C:\junit4.10\hamcrest-core-1.3.jar"; JunitRunner.java 
REM javac -classpath "C:\junit4.10\junit-4.10.jar";"C:\junit4.10\hamcrest-core-1.3.jar"; AssertionsTest.java JunitRunner.java
REM javac -classpath C:\junit4.10\junit-4.10.jar;C:\junit4.10\hamcrest-core-1.3.jar; AssertionsTest.java JunitRunner.java

echo -------------------------------------
echo Compile complete.
echo -------------------------------------

:RUN_TEST
java org.junit.runner.JUnitCore AssertionsTest

REM java -cp "%JUNIT_HOME%/junit-4.10.jar;." org.junit.runner.JUnitCore AssertionsTest

REM java org.junit.runner.JUnitCore JunitRunner

REM java org.junit.runner.JUnitCore C:\Depot\YS\CSP\activecable\simulator\bin\com\ge\activecable\RobotTest
REM java -classpath "C:\junit4.10\junit-4.10.jar";"C:\junit4.10\hamcrest-core-1.3.jar"; JunitRunner

REM java org.junit.runner.JUnitCore JunitRunner

REM java org.junit.runner.JUnitCore TestRunner
REM
REM java -classpath "C:\junit4.10\junit-4.10.jar";"C:\junit4.10\hamcrest-core-1.3.jar"; TestRunner

