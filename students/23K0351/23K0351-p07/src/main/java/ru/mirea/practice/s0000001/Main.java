package ru.mirea.practice.s0000001;

public abstract class Main {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();

        System.out.printf("2^4 = %f\n", mc.power(2, 4));
        System.out.printf("Modulus of  (3 + 4i) = %f\n", mc.modulus(3, 4));

        MathFunc mathFunc = new MathFunc();
        System.out.printf("Circle with radius 5 = %f\n", mathFunc.circle(5));

    }
}
