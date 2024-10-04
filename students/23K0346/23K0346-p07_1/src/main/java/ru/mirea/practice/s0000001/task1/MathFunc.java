package ru.mirea.practice.s0000001.task1;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double abs(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double circumference(double radius) {
        return 2 * PI * radius;
    }
}

