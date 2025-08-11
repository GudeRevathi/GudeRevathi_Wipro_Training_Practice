package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import main.java.Box;

public class BoxTest {

    Box box = new Box();
    double delta = 0.0001;
    @Test
    public void testAreaOfCircle() {
    	
        assertEquals(78.539816339744, box.areaOfCircle(5),delta);
    }

    @Test
    public void testAreaOfTriangle() {
    	
        assertEquals(30.0, box.areaOfTriangle(10, 6), delta);
    }

    @Test
    public void testAreaOfSquare() {
        assertEquals(25.0, box.areaOfSquare(5), delta);
    }

    @Test
    public void testAreaOfRectangle() {
        assertEquals(50.0, box.areaOfRectangle(10, 5), delta);
    }

    @Test
    public void testSimpleInterest() {
        assertEquals(100.0, box.simpleInterest(1000, 5, 2),delta);
    }

    @Test
    public void testCalculateAmount() {
    	assertEquals(1102.5, box.calculateAmount(), 0.0001);
    }
}

