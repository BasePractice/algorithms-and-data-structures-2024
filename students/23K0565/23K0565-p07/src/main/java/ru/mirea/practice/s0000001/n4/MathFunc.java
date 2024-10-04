package ru.mirea.practice.s0000001.n4;

public class MathFunc implements MathCalculable {

    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double abs(double real, double imag) {
        return Math.sqrt(real * real + imag * imag);
    }

    public double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        System.out.println("5^3 = " + mc1.power(5, 3));
        System.out.println("Модуль комплексного числа (3, 4) = " + mc1.abs(3, 4));

        MathFunc func = new MathFunc();
        System.out.println("Длина окружности радиуса 2 = " + func.circumference(2));
    }
}