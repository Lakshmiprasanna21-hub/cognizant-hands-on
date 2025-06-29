package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc;

    // --- Setup before each test
    @BeforeEach
    void setUp() {
        calc = new Calculator();
        System.out.println("Before each test");
    }

    // --- Cleanup after each test
    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    // --- Run once before all tests
    @BeforeAll
    static void initAll() {
        System.out.println("Before all tests");
    }

    // --- Run once after all tests
    @AfterAll
    static void cleanUpAll() {
        System.out.println("After all tests");
    }

    // --- Arrange-Act-Assert pattern examples:

    @Test
    void testAddition() {
        // Arrange
        int a = 10, b = 5;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    void testSubtraction() {
        int result = calc.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    void testMultiplication() {
        int result = calc.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    void testDivision() {
        int result = calc.divide(12, 3);
        assertEquals(4, result);
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
    }
}
