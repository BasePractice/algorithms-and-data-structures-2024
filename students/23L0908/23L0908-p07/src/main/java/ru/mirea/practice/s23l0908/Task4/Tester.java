package ru.mirea.practice.s23l0908.Task4;

public class Tester {
    public static void main(String[] args) {
        MathCalculable math = new MathFunc();
        System.out.println("7^2= " + math.pow(7, 2));
        System.out.println("Module x = 2+3i" + math.module(2, 3));
        System.out.println("The circumference of a circle has R = 3: " + 2 * math.PI() * 3);
    }
}