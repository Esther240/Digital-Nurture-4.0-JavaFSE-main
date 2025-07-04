package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);

        // ✅ Add this line to show output in Run window
        System.out.println("Test Passed: 2 + 3 = " + result);

        assertEquals(5, result);
    }
}
