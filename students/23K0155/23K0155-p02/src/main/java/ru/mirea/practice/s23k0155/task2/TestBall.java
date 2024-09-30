package ru.mirea.practice.s23k0155.task2;

import java.util.Scanner;

public abstract class TestBall {
    public static void main(String[] arg) {

        Ball var = new Ball(0.0, 0.0);
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("First data:" + var.toString());
            System.out.print("Enter new x:");
            var.setX(scanner.nextDouble());
            System.out.print("Enter new y:");
            var.setY(scanner.nextDouble());
            System.out.println("Second data:" + var.toString());
            System.out.print("Enter new x and y:");
            var.setXY(scanner.nextDouble(), scanner.nextDouble());
            System.out.println("Third data:" + var.toString());
            System.out.print("Enter data about move of ball:");
            var.move(scanner.nextDouble(), scanner.nextDouble());
            System.out.println("Последние координаты:" + var.toString());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }
}
