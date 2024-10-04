package ru.mirea.practice.s23k0505.task3;

import java.util.Random;

public abstract class Tester {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(5) + 1;
        Circle[] circles = new Circle[number];
        for (Circle circle : circles) {
            circle = new Circle(rand.nextDouble() * 200 - 100,
                    rand.nextDouble() * 200 - 100,
                    rand.nextDouble() * 100);
            System.out.println(circle);
        }
    }
}
