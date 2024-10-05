package ru.mirea.practice.s23L0908.task1;

class MathFunc implements MathCalculable {
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double modulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
}
