package com.lzf.tfirst.junit.exception;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    /**
     * 如果测试用例跑出了ArithmeticException异常，则忽略
     */
    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
