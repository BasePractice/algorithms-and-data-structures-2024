package ru.mirea.practice.s23k0116.task2;

import java.util.Scanner;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);
        ball.move(3.5, 2.5);
        System.out.println(ball);
        double[] coordinates = {0.0, 0.0};

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите координаты x, y");
            coordinates[0] = sc.nextDouble();
            coordinates[1] = sc.nextDouble();
        }

        Ball ballTest = new Ball(coordinates[0], coordinates[1]);
        System.out.println(ballTest);

    }
}
