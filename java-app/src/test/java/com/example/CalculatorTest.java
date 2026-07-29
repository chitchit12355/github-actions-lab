package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void addShouldReturnCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void multiplyShouldReturnCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.multiply(4, 5));
    }
}
