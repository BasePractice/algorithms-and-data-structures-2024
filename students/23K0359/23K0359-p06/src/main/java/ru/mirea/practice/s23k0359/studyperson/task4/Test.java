package ru.mirea.practice.s23k0359.studyperson.task4;

public abstract class Test {
    public static void main(String[] args) {

        Priceable radio = new Object("Радио", 750, 2);
        Priceable coffe = new Object("Кофе", 400, 77);

        System.out.println(radio);
        System.out.println(coffe);
    }
}