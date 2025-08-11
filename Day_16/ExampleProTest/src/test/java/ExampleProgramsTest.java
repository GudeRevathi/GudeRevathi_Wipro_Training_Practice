package test.java;

import org.junit.jupiter.api.Test;

import main.java.ExamplePrograms;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleProgramsTest {

    ExamplePrograms ep = new ExamplePrograms();

    @Test
    void testReverseArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, ep.reverseArray(input));
    }
    @Test
    void testAlphabetsRange() {
        int count = 0;
        for (char c = 'a'; c <= 'z'; c++) count++;
        assertEquals(26, count);
    }

    @Test
    void testAsciiValueOfCharacterA() {
        assertEquals(65, (int) 'A');
        assertEquals(90, (int) 'Z');
    }
    @Test
    void testFactorial() {
        assertEquals(120, ep.factorial(5));
        assertEquals(1, ep.factorial(0));
    }
    @Test
    void testCountPosNegZero() {
        int[] input = {1, -2, 0, 5, 0, -9};
        int[] expected = {2, 2, 2}; 
        assertArrayEquals(expected, ep.countPosNegZeroFromArray(input));
    }
    @Test
    void testFindMinMax() {
        int[] input = {10, 5, -1, 7, 0};
        int[] expected = {-1, 10};
        assertArrayEquals(expected, ep.findMinMaxFromArray(input));
    }
    
    @Test
    void testNumbersDivisibleBy9AndSum() {
        int[] result = ep.numbersDivisibleBy9InRange(100, 200);
        int[] expected = {108, 117, 126, 135, 144, 153, 162, 171, 180, 189, 198};
        assertArrayEquals(expected, result);
        assertEquals(1683, ep.sumOfArray(result));
    }


    @Test
    void testOnesComplement() {
        assertEquals(~5, ep.onesComplement(5));
    }

    @Test
    void testTwosComplement() {
    	assertEquals(-5, ep.twoComplement(5));
    }

    @Test
    void testFibonacci() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, ep.fibonacci(10));
    }


    

    

    
}
