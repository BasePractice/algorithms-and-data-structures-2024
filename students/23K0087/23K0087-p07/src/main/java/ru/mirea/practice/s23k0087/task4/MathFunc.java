package ru.mirea.practice.s23k0087.task4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double abs(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double lengthCircle(double radius) {
        return 2 * PI * radius;
    }
}