package ru.mirea.practice.s23k0120.task2.ball;


import java.util.Locale;
import java.util.Scanner;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);
        ball.move(5, 5);
        System.out.println(ball);
        double[] coords = {0f, 0f};

        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.US);
            System.out.println("Введите координаты мяча через пробел: ");
            coords[0] = sc.nextDouble();
            coords[1] = sc.nextDouble();
        }
        Ball ball1 = new Ball(coords[0], coords[1]);
        System.out.println(ball1);
    }
}
