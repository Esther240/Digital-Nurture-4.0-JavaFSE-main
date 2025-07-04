package org.example;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
public class AAAExampleTest {
    private int number;
    @Before
    public void setUp() {
        System.out.println("Setting up test data...");
        number = 5;
    }
    @After
    public void tearDown() {
        System.out.println("Cleaning up test data...");
        number = 0;
    }
    @Test
    public void testAdd() {
        int result = number + 3;
        assertEquals(8, result);
    }
    @Test
    public void testMultiply() {
        int result = number * 2;
        assertEquals(10, result);
    }
}
