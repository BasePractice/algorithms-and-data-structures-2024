package ru.mirea.practice.s23k0505.task4;

public abstract class Main {
    public static void main(String[] args) {
        MathCalculable mathFunc = new MathFunc();
        System.out.println(mathFunc.pow(2, -3));
        System.out.println(mathFunc.complexLength(1, 1));
    }
}
