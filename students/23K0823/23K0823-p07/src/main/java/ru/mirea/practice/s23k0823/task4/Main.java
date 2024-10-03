package ru.mirea.practice.s23k0823.task4;

public abstract class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        System.out.println("PI: " + mc1.getPI());
        System.out.println("2^3: " + mc1.pow(2, 3));
        System.out.println("|3+4i|: " + mc1.absComplex(3, 4));
        MathFunc mc2 = new MathFunc();
        System.out.println("Длина окружности с радиусом 5: " + mc2.calculateCircleLength(5.0));
    }
}
