package ru.mirea.practice.s23k0505.task2;

import java.util.Scanner;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Начальные координаты мяча: ");
            ball.setXY(sc.nextDouble(), sc.nextDouble());

            System.out.println("Перемещение мяча на координаты: ");
            ball.move(sc.nextDouble(), sc.nextDouble());
            System.out.printf("Новые координаты мяча: %.2f, %.2f", ball.getX(), ball.getY());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
