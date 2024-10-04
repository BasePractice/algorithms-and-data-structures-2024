package ru.mirea.practice.s23k1167.task4;


public class MathFunc implements MathCalculable {
    private static final double PI = 3.14159;

    @Override
    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double absComplex(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public double getPI() {
        return PI;
    }

    public double calculateCircleLength(double radius) {
        return 2 * getPI() * radius;
    }
}