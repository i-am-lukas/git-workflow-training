package org.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void init(){
        calc = new Calculator();
    }

    @Test
    public void subtracts2Numbers() {
        int result = calc.subtract("3", "2");
        assertEquals(1, result);
    }

    @Test
    public void zeroVerify() {
        int result = calc.subtract("2", "2");
        assertTrue("Should be true", result == 0);
    }

    @Test
    public void zeroValue() {
        int result = calc.subtract("3", "2");
        assertEquals("Zero value", 0, result);
    }

}
