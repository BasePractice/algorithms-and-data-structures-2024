package ru.mirea.practice.s23k0087.task4;

public abstract class Tester {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();

        double base = 8;
        double exponent = 2;
        System.out.println(base + "^" + exponent + " = " + math.pow(base, exponent));

        double radius = 10;
        System.out.println("Circle length = " + math.lengthCircle(radius));

        double real = 6;
        double imaginary = -7.5;
        System.out.printf("Abs = %.3f", math.abs(real, imaginary));
    }
}