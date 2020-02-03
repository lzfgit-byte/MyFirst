package com.lzf.tfirst.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {

    @Test
    public void testAdd() {
        String str= "Junit is working fine";
        assertEquals("Junit is working33 fine",str);
    }
}
