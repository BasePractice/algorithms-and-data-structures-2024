package ru.mirea.practice.s23k0130.task4;

public abstract class Main {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        double num = 20;
        int exp = 3;
        System.out.printf("Возведение %.1f в степень %d: %.2f%n", num, exp, mathFunc.power(num, exp));

        double compl = 30;
        System.out.printf("Модуль комплексного числа (%.1f + %.1fi): %.2f%n", num, compl, mathFunc.complexModuls(num, compl));

        double radius = 40;
        System.out.printf("Длина окружности с радиусом %.1f: %.2f%n", radius, mathFunc.circleLength(radius));
    }
}
