package org.example.service;

import org.example.ScientificCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    // Testes básicos sem uso de @BeforeEach
    @Nested
    class ScientificCalculatorBasicTest {

        @Test
        public void testAddition() {
            ScientificCalculator calculator = new ScientificCalculator();
            double result = calculator.add(8.0, 2.0);
            assertEquals(10.0, result);
        }

        @Test
        public void testSubtraction() {
            ScientificCalculator calculator = new ScientificCalculator();
            double result = calculator.subtract(10.0, 4.0);
            assertEquals(6.0, result);
        }
    }

    // Testes avançados com setup comum com @BeforeEach
    @Nested
    class ScientificCalculatorAdvancedTest {

        private ScientificCalculator calculator;

        @BeforeEach
        public void setUp() {
            calculator = new ScientificCalculator();
        }

        // Operações básicas
        @Test
        public void testAddition() {
            double result = calculator.add(3.0, 2.0);
            assertEquals(5.0, result);
        }

        @Test
        public void testSubtraction() {
            double result = calculator.subtract(10.0, 4.0);
            assertEquals(6.0, result);
        }

        @Test
        public void testMultiplication() {
            double result = calculator.multiply(3.0, 4.0);
            assertEquals(12.0, result);
        }

        // Testes de divisão
        @Test
        public void testDivideByZero() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculator.divide(0.0, 0.0);
            });
        }

        // Testes de raiz quadrada
        @Test
        public void testSquareRootPositive() {
            double result = calculator.squareRoot(25.0);
            assertEquals(5.0, result);
        }

        @Test
        public void testSquareRootNegative() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculator.squareRoot(-9.0);
            });
        }

        // Testes de logaritmo
        @Test
        public void testLogPositive() {
            double result = calculator.log(1.0);
            assertEquals(0.0, result);
        }

        @Test
        public void testLogNegative() {
            assertThrows(IllegalArgumentException.class, () -> {
                calculator.log(-5.0);
            });
        }

        // Testes de trigonometria
        @Test
        public void testSinZero() {
            double result = calculator.sin(0.0);
            assertEquals(0.0, result);
        }

        @Test
        public void testSinNinety() {
            double result = calculator.sin(90.0);
            assertEquals(1.0, result, 0.0001); // com margem de erro para imprecisão trigonométrica
        }
    }

    /*
     * Questão 9:
     *
     * Quais métodos da calculadora merecem mais atenção nos testes?
     * - O método 'divide', especialmente quando se trata de divisão por zero ou números negativos.
     * - Também funções como 'squareRoot' e 'log', que têm restrições de domínio (não aceitam negativos).
     *
     * Como a cobertura de código pode ajudar a identificar lacunas?
     * - A cobertura de código mostra quais trechos foram ou não executados pelos testes.
     * - Isso ajuda a identificar métodos ou cenários não cobertos, como exceções, limites e entradas inválidas.
     */
}
