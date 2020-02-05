package org.oose.dea;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator ();
        assertEquals(4, calculator.add(2,2));
        assertEquals(100, calculator.add(25,75));
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator ();
        assertEquals(-4, calculator.subtract(8,12));
        assertEquals(100, calculator.subtract(150,50));
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator ();
        assertEquals(4, calculator.multiply(2,2));
        assertEquals(100, calculator.multiply(2,50));
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator ();
        assertEquals(1, calculator.divide(2,2));
        assertEquals(5, calculator.divide(50,10));
    }
}
