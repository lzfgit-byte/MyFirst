package com.lzf.tfirst.junit.test_suit;

import com.lzf.tfirst.junit.runWitch.TestJunit1;
import com.lzf.tfirst.junit.runWitch.TestJunit2;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite  {
    public static void main(String[] a) {
        // add the test's in the suite
        TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class);
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("Number of test cases = " + result.runCount());
    }
}
