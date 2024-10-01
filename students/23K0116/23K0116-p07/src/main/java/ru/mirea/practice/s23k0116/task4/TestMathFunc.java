package ru.mirea.practice.s23k0116.task4;

public abstract class TestMathFunc {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();

        double base = 4;
        double exponent = 2;
        System.out.println(base + "^" + exponent + " = " + math.pow(base, exponent));

        double radius = 3;
        System.out.println("Circle length = " + math.lengthCircle(radius));

        double real = 4;
        double imaginary = -7;
        System.out.printf("Abs = %.3f", math.abs(real, imaginary));
    }
}
