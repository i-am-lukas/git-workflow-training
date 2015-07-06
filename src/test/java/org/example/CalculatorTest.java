package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
    
    Calculator calc = new Calculator();
    
    @Test
    public void subtracts2Numbers() {

        int result = calc.subtract("3", "2");
        
        assertEquals(1, result);
    }
}
