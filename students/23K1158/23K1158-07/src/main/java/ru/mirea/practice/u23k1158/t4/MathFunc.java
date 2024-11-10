package ru.mirea.practice.u23k1158.t4;

public class MathFunc implements MathCalculable {

    public double power(double num, int exp) {
        return Math.pow(num, exp);
    }

    public double complexModuls(double real, double compl) {
        return Math.sqrt(real * real + compl * compl);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}
