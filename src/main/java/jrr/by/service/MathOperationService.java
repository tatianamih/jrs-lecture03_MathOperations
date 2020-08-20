package jrr.by.service;

import jrr.by.jis.bean.MathOperation;

public class MathOperationService {

    public int additionOfIntegers(MathOperation mathOperation) {

        return mathOperation.getA() + mathOperation.getB();
    }

    public int subtractionOfNumbers(MathOperation mathOperation) {
        return mathOperation.getA() - mathOperation.getB();
    }

    public int division(MathOperation mathOperation) {

        return mathOperation.getA() / mathOperation.getB();
    }

    public int multiplication(MathOperation mathOperation) {

        return mathOperation.getA() * mathOperation.getB();
    }

    public int remainder(MathOperation mathOperation) {

        return mathOperation.getA() % mathOperation.getB();
    }
    public  double additionOfDouble(MathOperation mathOperation) {
        return mathOperation.getC() + mathOperation.getD();
    }
}
