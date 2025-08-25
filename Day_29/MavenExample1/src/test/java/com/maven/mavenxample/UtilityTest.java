package com.maven.mavenxample;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilityTest {

    @Test
    public void testAdd() {
        assertEquals(10, UtilityClass.add(6, 4));
    }

    @Test
    public void testSub() {
        assertEquals(2, UtilityClass.sub(6, 4));
    }

    @Test
    public void testMul() {
        assertEquals(24, UtilityClass.mul(6, 4));
    }

    @Test
    public void testDiv() {
        assertEquals(2, UtilityClass.div(8, 4));
    }
}
