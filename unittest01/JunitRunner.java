// package com.javacodegeeks.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
 
public class JunitRunner { 
    public static void main(String[] args) { 
        Result result = JUnitCore.runClasses(AssertionsTest.class);
        // Result result = JUnitCore.runClasses(TestJunit.class);
        for (Failure failure : result.getFailures()) {
            // System.out.println(fail.toString());
            System.out.println("ERROR!");
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests finished successfully...");
        }
    }
}

