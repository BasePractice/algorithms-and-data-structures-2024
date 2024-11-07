package ru.mirea.practices0000001.task4;

public abstract class MathCalculableApp {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        double radius = 5.0;
        double length = mathFunc.circleLength(radius);
        System.out.println("Длина окружности с радиусом " + radius + " равна " + length);

        double base = 2.0;
        double exponent = 3.0;
        double result = mathFunc.power(base, exponent);
        System.out.println(base + " в степени " + exponent + " равно " + result);

        double real = 3.0;
        double imaginary = 4.0;
        double modulus = mathFunc.complexModulus(real, imaginary);
        System.out.println("Модуль комплексного числа " + real + " + " + imaginary + "i равен " + modulus);
    }
}