package jrr.by.service;

import jrr.by.jis.bean.MathOperation;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathOperationServiceTest {

    @org.junit.Test
    public void additionOfIntegersTest() {
        MathOperation mathOperation = new MathOperation(500, 600, 400.1, 5000.3);
        MathOperationService mathOperationService = new MathOperationService();
        int expected = 1100;
        int actual = mathOperationService.additionOfIntegers(mathOperation);
        assertEquals(expected, actual);
    }

    @Test
    public void differenceOfNumbersTest() {
        MathOperation mathOperation = new MathOperation(2000, 600, 500.3, 600.3);
        MathOperationService mathOperationService = new MathOperationService();
        int expected = 1400;
        int actual = mathOperationService.subtractionOfNumbers(mathOperation);
        assertEquals(expected, actual);
    }

    @Test
    public void divisionTest() {
        MathOperation mathOperation = new MathOperation(120000, 60000, 10000.1, 5000.2);
        MathOperationService mathOperationService = new MathOperationService();
        int expected = 2;
        int actual = mathOperationService.division(mathOperation);
        assertEquals(expected, actual);
    }

    @Test
    public void multiplicationTest() {
        MathOperation mathOperation = new MathOperation(1000, 60, 500.3, 5000.4);
        MathOperationService mathOperationService = new MathOperationService();
        int expected = 60000;
        int actual = mathOperationService.multiplication(mathOperation);
        assertEquals(expected, actual);
    }

    @Test
    public void remainderTest() {
        MathOperation mathOperation = new MathOperation(12000, 6000, 1000.1, 5000.3);
        MathOperationService mathOperationService = new MathOperationService();
        int expected = 0;
        int actual = mathOperationService.remainder(mathOperation);
        assertEquals(expected, actual);
    }

    @Test
    public void additionOfDoubleTest() {
        MathOperation mathOperation = new MathOperation(12000,5000, 500.1, 499.9);
        MathOperationService  mathOperationService = new MathOperationService();
        double expected = 1000.0;
        double actual = mathOperationService.additionOfDouble(mathOperation);
        double delta = 0;
        assertEquals(expected, actual, delta);
    }
}