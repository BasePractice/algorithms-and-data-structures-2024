package ru.mirea.practice.s0000001.task1.task1.task1;

import java.util.Scanner;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив заполнен. Не удается добавить больше кружочков.");
        }
    }

    public void printCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Tester tester = new Tester(3);

            for (int i = 0; i < 3; i++) {
                System.out.println("Введите координату x для центра окружности " + (i + 1) + ": ");
                double x = scanner.nextDouble();
                System.out.println("Введите координату y для центра окружности " + (i + 1) + ": ");
                double y = scanner.nextDouble();
                System.out.println("Введите радиус окружности " + (i + 1) + ": ");
                double radius = scanner.nextDouble();

                tester.addCircle(new Circle(new Point(x, y), radius));
            }

            tester.printCircles();
            System.out.println("Общее количество кругов: " + tester.getCount());
        }
    }
}
