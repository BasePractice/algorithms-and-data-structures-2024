package ru.mirea.practice.s23L0908;

public class MathFunc implements MathCalculable {

    public double power(double num, int exp) {
        return Math.pow(num, exp);
    }

    public double complexModuls(double real, double img) {
        return Math.sqrt(real * real + img * img);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}
