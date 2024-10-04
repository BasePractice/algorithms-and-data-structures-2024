package ru.mirea.practice.s23k0130.task4;

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
