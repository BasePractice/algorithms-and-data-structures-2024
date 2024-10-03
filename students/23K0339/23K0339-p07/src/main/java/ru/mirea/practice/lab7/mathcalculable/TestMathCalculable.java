package ru.mirea.practice.lab7.mathcalculable;

public abstract class TestMathCalculable {
    public static void main(String[] args) {
        MathFunc mc1 = new MathFunc();

        double base = 2;
        int exponent = 3;
        System.out.println(base + " ^ " + exponent + " = " + mc1.pow(base, exponent));
        double real = 3;
        double imaginary = 4;
        System.out.println("Модуль (" + real + ", " + imaginary + ") = " + mc1.abs(real, imaginary));

        double radius = 5;
        System.out.println("Длина окружности с радиусом " + radius + " = " + mc1.circleLength(radius));
    }
}
