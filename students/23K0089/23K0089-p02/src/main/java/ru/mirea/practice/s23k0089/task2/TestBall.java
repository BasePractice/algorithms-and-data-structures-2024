package ru.mirea.practice.s23k0089.task2;

import java.util.Scanner;

public abstract class TestBall {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] coords = {0f, 0f};
            System.out.println("Введите координаты мяча: ");
            coords[0] = sc.nextDouble();
            coords[1] = sc.nextDouble();
            Ball ball1 = new Ball(coords[0], coords[1]);
            System.out.println(ball1);
            Ball ball2 = new Ball();
            System.out.println(ball2);
            ball2.move(5, 5);
            System.out.println(ball2);
        }
    }
}
