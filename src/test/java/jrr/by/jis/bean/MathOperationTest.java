package jrr.by.jis.bean;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathOperationTest {

    @Test
    public void getA() {
        MathOperation mathOperation = new MathOperation(15000, 10000, 50.2, 3000.2);
        int expected = 15000;
        int actual = mathOperation.getA();
        assertEquals(expected, actual);
    }

    @Test
    public void getB() {
        MathOperation mathOperation = new MathOperation(15000, 10000, 5000.2, 3000.5);
        int expected = 10000;
        int actual = mathOperation.getB();
        assertEquals(expected, actual);
    }

    @Test
    public void getD() {
        MathOperation mathOperation = new MathOperation(15000, 12000, 1500.2, 2300000.1);
        double expected = 1500.2;
        double actual = mathOperation.getD();
        double delta = 0;
        assertEquals(expected,actual,delta);
    }

    @Test
    public void getC() {
        MathOperation mathOperation = new MathOperation(15000, 12000, 1500.2, 2300000.1);
        double expected = 2300000.1;
        double actual = mathOperation.getC();
        double delta = 0;
        assertEquals(expected,actual,delta);
    }
}