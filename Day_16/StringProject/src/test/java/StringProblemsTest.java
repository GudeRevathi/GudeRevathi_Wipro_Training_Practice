package test.java;
import org.junit.jupiter.api.Test;
import main.java.StringProblems;

import static org.junit.jupiter.api.Assertions.*;
public class StringProblemsTest {
	StringProblems sp = new StringProblems();
	@Test
    void testRemoveSpaces() {
        String input = "Hello World Java";
        String expected = "HelloWorldJava";
        assertEquals(expected, sp.removeSpaces(input));
    }

    @Test
    void testConcatenate() {
        String s1 = "Hello";
        String s2 = "World";
        String expected = "Hello World";
        assertEquals(expected, sp.concatenate(s1, s2));
    }
	

}
