package ru.mirea.practice.s0000001.task4;

public abstract class Tester {
    public static void main(String[] args) {
        MathCalculable a = new MathFunc();
        System.out.println(a.pow(4,3));
        System.out.println(a.moduleOfComplex(5,4));
        System.out.println(a.PI);
    }
}
