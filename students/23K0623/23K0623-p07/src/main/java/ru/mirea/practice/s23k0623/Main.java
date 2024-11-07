package ru.mirea.practice.s23k0623;

public abstract class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        System.out.println("2^3 = " + mc1.pow(2, 3));

        System.out.println("|3 + 4i| = " + mc1.abs(3, 4));

        MathFunc mathFunc = new MathFunc();
        System.out.println("Длина окружности радиусом 5 = " + mathFunc.circumference(5));
    }
}

