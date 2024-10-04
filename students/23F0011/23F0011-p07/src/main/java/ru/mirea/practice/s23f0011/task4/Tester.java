package ru.mirea.practice.s23f0011.task4;

public abstract class Tester {
    public static void main(String[] args) {
        MathCalculable mathFunc = new MathFunc();
        double radius = 5.0;
        double lenght = 2 * MathCalculable.PI * radius;
        System.out.println("Длина окружности с радиусом " + radius + ": " + lenght);
        double real = 3.0;
        double imaginary = 4.0;
        double modulus = mathFunc.abs(real, imaginary);
        System.out.println("Модуль комплексного числа (" + real + ", " + imaginary + "): " + modulus);
    }
}
