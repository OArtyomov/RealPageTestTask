package com.realpage.calculator.utils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty("asa"));
        assertTrue(StringUtils.isNotEmpty("  "));
        assertTrue(StringUtils.isNotEmpty(" "));
    }

    @Test
    public void isDouble() {
        assertFalse(StringUtils.isDouble(null));
        assertFalse(StringUtils.isDouble("fdsfsd"));
        assertTrue(StringUtils.isDouble("23"));
        assertTrue(StringUtils.isDouble("23.0000"));
    }
}