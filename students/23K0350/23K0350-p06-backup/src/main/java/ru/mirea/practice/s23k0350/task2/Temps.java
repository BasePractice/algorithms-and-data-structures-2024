package ru.mirea.practice.s23k0350.task2;

public abstract class Temps {
    public static void main(String[] args) {
        Fahrenheit t1 = new Fahrenheit(36.6);
        System.out.println(t1.toString());
        t1.convert();
        System.out.println(t1.toString());
        Calvin t2 = new Calvin(36.6);
        System.out.println(t2.toString());
        t2.convert();
        System.out.println(t2.toString());
    }
}
