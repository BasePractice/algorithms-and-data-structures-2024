package ru.mirea.practice.s0000001.prog4;

public abstract class Main {
    public static void main(String[] arg) {
        int intsum = Calculator.sum(5, 5);
        System.out.println(intsum);

        double doublemultiply = Calculator.multiply(5.5, 5.5);
        System.out.println(doublemultiply);

        float floatdivide = Calculator.divide(5.5f, 1f);
        System.out.println(floatdivide);

        int intsubtraction = Calculator.subtraction(5, 5);
        System.out.println(intsubtraction);
    }
}
