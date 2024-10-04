package ru.mirea.practices0000001.task4;

class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}
