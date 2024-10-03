package ru.mirea.practice.s23k0350.task2;

public abstract class Main {
    public static void main(String[] args) {
        MathFunc mf = new MathFunc(4,5,10);
        System.out.println("Module: " + mf.module());
        System.out.println("Power: " + mf.power());
        System.out.println("Length: " + mf.lenokr());
    }
}
