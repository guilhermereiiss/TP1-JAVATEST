package org.example.service;
import org.example.ScientificCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScientificCalculatorTESTEZINHO {
    @Test
    public void testAddition() {
        ScientificCalculator calculator = new ScientificCalculator();
        double result = calculator.add(3.0, 2.0);
        assertEquals(5.0, result);
    }

    @Test
    public void testSubtraction() {
        //  Setup ou Arrange : cria o objeto que será testado
        ScientificCalculator calculator = new ScientificCalculator();
        // Execution ou ACT : executa o metodo que será testado
        double result = calculator.subtract(10.0, 4.0);
        // Assertion: verifica se o resultado está correto com o que a gente espera
        assertEquals(6.0, result);
        // Teardown: não é preciso nesse momento (sem recursos externos ou modificações de estado)
    }
}

