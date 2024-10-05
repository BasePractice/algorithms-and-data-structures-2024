package ru.mirea.practice.s23L0908.Task3;

import java.util.Random;
public class Tester {
    public static void main(String[] args) {
        Random random = new Random();
        int average = random.nextInt(13) + 2;
        Circle[] balls = new Circle[average];
        for (int i = 0; i < average; ++i) {
            balls[i] = new Circle(random.nextDouble() * 20 - 10,
                random.nextDouble() * 20 - 10,
                random.nextDouble() * 10,
                (char) (random.nextInt(26) + 97));
            System.out.println(balls[i].toString());
        }
    }
}


