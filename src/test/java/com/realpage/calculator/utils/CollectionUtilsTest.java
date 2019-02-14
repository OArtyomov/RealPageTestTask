package com.realpage.calculator.utils;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CollectionUtilsTest {

    @Test
    public void testisNotEmpty() {
        assertFalse(CollectionUtils.isNotEmpty(null));
        assertFalse(CollectionUtils.isNotEmpty(Collections.emptyList()));
        assertTrue(CollectionUtils.isNotEmpty(Collections.singletonList(5L)));
    }
}