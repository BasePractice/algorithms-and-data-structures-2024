package ru.mirea.practice.s0000001;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, int exp) {
        return Math.pow(base, exp);
    }

    @Override
    public double modulus(double real, double image) {
        return Math.sqrt(real * real + image * image);
    }

    public double circle(double radius) {
        return 2 * PI * radius;
    }


}
