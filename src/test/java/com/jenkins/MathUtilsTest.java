package com.jenkins;
import static org.junit.Assert.*;
import org.junit.Test;


public class MathUtilsTest {

    @Test
    public void testAdd() {
        MathUtils calculator = new MathUtils();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract(){
        MathUtils calculator = new MathUtils();
        int result = calculator.subtract(7, 4);
        assertEquals(3, result);
    }

    @Test
    public void testMultiply(){
        MathUtils calculator = new MathUtils();
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDivide(){
        MathUtils calculator = new MathUtils();
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
}