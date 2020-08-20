package jrr.by.jis.bean;


public class MathOperation {
    private int a;
    private int b;
    private double d;
    private  double c;

    public MathOperation(int i, int i1) {
    }

    public MathOperation(int a, int b, double d, double c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double getD() {
        return d;
    }

    public double getC() {
        return c;
    }
}
