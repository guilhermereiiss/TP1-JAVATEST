package org.example.service;
import org.example.ScientificCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTESTEZAO{

    private ScientificCalculator calculator;

    // Test Fixture - executado antes de cada teste
    @BeforeEach
    public void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    public void testAddition() {
        // Usando o mesmo objeto instanciado no @BeforeEach
        double result = calculator.add(3.0, 2.0);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testSubtraction() {
        // Reaproveitando a mesma instância
        double result = calculator.subtract(10.0, 4.0);
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testMultiplication() {
        // Reaproveitando a mesma instancia
        double result = calculator.multiply(3.0, 4.0);
        assertEquals(12.0, result, 0.0001);
    }

    @Test
    public void testSquareRootPositive() {
        double result = calculator.squareRoot(25.0);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-9.0);
        });
    }

    @Test public void  testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(0.0, 0.0);
        });
    }

    @Test
    public void testLogPositive() {
        // log(1) = 0
        double result = calculator.log(1.0);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testSinPositive() {
        // seno(0) = 0
        double result = calculator.sin(0.0);
        assertEquals(0.0, result, 0.0001);

        // seno(90) = 1
        result = calculator.sin(90.0);
        assertEquals(1.0, result, 0.0001);
    }
}
