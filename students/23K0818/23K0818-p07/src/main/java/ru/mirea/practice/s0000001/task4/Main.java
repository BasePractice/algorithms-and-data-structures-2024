package ru.mirea.practice.s0000001.task4;

public abstract class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        double base = 2;
        double exponent = 3;
        double resultPow = mc1.pow(base, exponent);
        System.out.println("2^3 = " + resultPow);

        double real = 3;
        double imaginary = 4;
        double resultAbsComplex = mc1.absComplex(real, imaginary);
        System.out.println("|3 + 4i| = " + resultAbsComplex);

        MathFunc mathFunc = new MathFunc();
        double radius = 5;
        double circleLength = mathFunc.calculateCircleLength(radius);
        System.out.println("Длина окружности с радиусом 5: " + circleLength);
    }
}
