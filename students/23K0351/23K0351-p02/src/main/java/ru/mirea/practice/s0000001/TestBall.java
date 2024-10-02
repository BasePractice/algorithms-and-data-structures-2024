package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract  class TestBall {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Ball ball = new Ball();
            ball.move(10, 10);
            System.out.printf("X = %.2f, Y = %.2f\n", ball.getX(), ball.getY());

            System.out.print("Введите два числа, для X и Y: ");
            Ball ball1 = new Ball(scan.nextDouble(), scan.nextDouble());
            System.out.println(ball1.toString());

            System.out.print("Введите X: ");
            ball1.setX(scan.nextDouble());

            System.out.print("\nВведите Y: ");
            ball1.setY(scan.nextDouble());

            System.out.println(ball1.toString());


        }
    }
}