package ru.mirea.practice.s0000001.task4;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double absComplex(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double calculateCircleLength(double radius) {
        return 2 * PI * radius;
    }
}
