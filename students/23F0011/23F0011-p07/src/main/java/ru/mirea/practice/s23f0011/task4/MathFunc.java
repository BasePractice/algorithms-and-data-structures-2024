package ru.mirea.practice.s23f0011.task4;

public class MathFunc implements MathCalculable {
    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double abs(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
}
