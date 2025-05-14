package com.devcalc;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService calculator = new CalculatorService();

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(15.0, calculator.add(10, 5), 0.001);
    }

    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(5.0, calculator.subtract(10, 5), 0.001);
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(50.0, calculator.multiply(10, 5), 0.001);
    }

    @Test
    public void testDividePositiveNumbers() {
        assertEquals(2.0, calculator.divide(10, 5), 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {calculator.divide(10, 0);});
    }
}
