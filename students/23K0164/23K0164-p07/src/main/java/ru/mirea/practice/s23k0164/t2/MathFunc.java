package ru.mirea.practice.s23k0164.t2;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, double degree) {
        return Math.pow(base, degree);
    }

    @Override
    public double modulus(double realPart, double imaginaryPart) {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    public double circumference(double radius) {
        return 2 * PI * radius;
    }

}
