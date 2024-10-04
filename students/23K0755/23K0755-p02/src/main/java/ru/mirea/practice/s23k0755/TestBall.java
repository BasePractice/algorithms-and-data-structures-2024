package ru.mirea.practice.s23k0755;


import java.util.Scanner;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0);
        System.out.println(ball.toString());
        try (Scanner scanner = new Scanner(System.in)) {
            String choose;
            System.out.println("Какую координату хотите поменять? X, Y, XY");
            choose = scanner.next();
            if ("X".equals(choose)) {
                double x;
                System.out.println("Введите X");
                x = scanner.nextDouble();
                ball.setX(x);
                System.out.println("Новые координаты:");
                System.out.println(ball.toString());
            }
            if ("Y".equals(choose)) {
                double y;
                System.out.println("Введите Y");
                y = scanner.nextDouble();
                ball.setY(y);
                System.out.println("Новые координаты:");
                System.out.println(ball.toString());
            }
            if ("XY".equals(choose)) {
                double x;
                double y;
                System.out.println("Введите X, затем Y");
                x = scanner.nextDouble();
                y = scanner.nextDouble();
                ball.setXY(x,y);
                System.out.println("Новые координаты:");
                System.out.println(ball.toString());
            }
            System.out.println("Куда двигаться? Введите значение для x, потом для y");
            double xdisp;
            double ydisp;
            xdisp = scanner.nextDouble();
            ydisp = scanner.nextDouble();
            ball.move(xdisp, ydisp);
            System.out.println("Новые координаты:");
            System.out.println(ball.toString());
        }
    }
}