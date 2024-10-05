package ru.mirea.practice.s23L0908;

public abstract class MainCalculate {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        double num = 2;
        int exp = 10;
        System.out.printf("Возведение %.1f в степень %d: %.2f%n", num, exp, mathFunc.power(num, exp));

        double img = 5;
        System.out.printf("Модуль комплексного числа (%.1f + %.1fi): %.2f%n", num, img, mathFunc.complexModuls(num, img));

        double radius = 7;
        System.out.printf("Длина окружности с радиусом %.1f: %.2f%n", radius, mathFunc.circleLength(radius));
    }
}
