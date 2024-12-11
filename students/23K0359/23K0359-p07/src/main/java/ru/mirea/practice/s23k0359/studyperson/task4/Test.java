package ru.mirea.practice.s23k0359.studyperson.task4;

public abstract class Test {
    public static void main(String[] args) {
        MathFunc mathmatics = new MathFunc();

        double base = 11;
        double exponent = 3;
        System.out.println(base + " в степени " + exponent + " = " + mathmatics.pow(base, exponent));

        double radius = 4;
        System.out.println("Длина окружности равна " + mathmatics.circle(radius));

        double real = 3;
        double imaginary = -4;
        System.out.println("Модуль равен " + mathmatics.abs(real, imaginary));
    }
}