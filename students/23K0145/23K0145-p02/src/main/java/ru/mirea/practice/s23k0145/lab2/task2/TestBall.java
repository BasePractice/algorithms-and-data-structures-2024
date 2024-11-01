package ru.mirea.practice.s23k0145.lab2.task2;

import java.util.Scanner;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);
        ball.move(10, 25.38);
        System.out.println(ball);
        double[] coord = {0.0, 0.0};

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите координаты x, y");
            coord[0] = sc.nextDouble();
            coord[1] = sc.nextDouble();
        }

        Ball newball = new Ball(coord[0], coord[1]);
        System.out.println(newball);

    }
}