package mirea.lab2;

import java.util.Scanner;

public abstract class TestBall {
    public static void main(String[] args) {
        double x;
        double y;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите x: ");
            x = sc.nextDouble();
            System.out.println("Введите y: ");
            y = sc.nextDouble();
            sc.close();
            Ball a = new Ball(x, y);
            System.out.format("Текущее положение:\nx - %f\ny - %f", a.getX(), a.getY());
            a.setXY(5, 5);
            a.move(10, 5);
            System.out.format("\nТекущее положение:\nx - %f\ny - %f", a.getX(), a.getY());
        }
    }
}
