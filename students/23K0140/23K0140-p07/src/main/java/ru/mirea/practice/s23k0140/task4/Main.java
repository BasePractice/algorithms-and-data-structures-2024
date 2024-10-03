package ru.mirea.practice.s23k0140.task4;

public abstract class Main {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();

        double base = 8;
        double exponent = 3;
        System.out.println(base + "^" + exponent + " = " + math.pow(base, exponent));

        double radius = 5;
        System.out.println("Circle length = " + math.lengthCircle(radius));

        double real = 3;
        double imaginary = -9;
        System.out.printf("Abs = %.3f", math.abs(real, imaginary));
    }
}