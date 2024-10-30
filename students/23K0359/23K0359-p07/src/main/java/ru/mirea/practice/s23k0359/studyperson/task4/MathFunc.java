package ru.mirea.practice.s23k0359.studyperson.task4;

public class MathFunc implements MathCalculable {

    @Override
    public double abs(double real, double imaginary) {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary,2));
    }

    @Override
    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double circle(double radius) {
        return 2 * PI * radius;
    }
}