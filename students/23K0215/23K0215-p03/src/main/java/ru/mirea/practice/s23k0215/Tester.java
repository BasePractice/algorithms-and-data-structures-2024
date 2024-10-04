package ru.mirea.practice.s23k0215;

import java.util.Arrays;
import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int numberOfCircles;

    public Tester(int numberOfCircles) {
        this.numberOfCircles = numberOfCircles;
        this.circles = new Circle[numberOfCircles];
        initializeCircles();
    }

    // Метод для инициализации массива окружностей с использованием Random
    private void initializeCircles() {
        Random random = new Random();
        for (int i = 0; i < numberOfCircles; i++) {
            double x = random.nextDouble() * 100;
            double y = random.nextDouble() * 100;
            double radius = random.nextDouble() * 50;
            circles[i] = new Circle(new Point(x, y), radius);
        }
    }

    // Метод для нахождения самой маленькой окружности
    public Circle findSmallestCircle() {
        Circle smallest = circles[0];
        for (Circle circle : circles) {
            if (circle.getRadius() < smallest.getRadius()) {
                smallest = circle;
            }
        }
        return smallest;
    }

    // Метод для нахождения самой большой окружности
    public Circle findLargestCircle() {
        Circle largest = circles[0];
        for (Circle circle : circles) {
            if (circle.getRadius() > largest.getRadius()) {
                largest = circle;
            }
        }
        return largest;
    }

    // Метод для сортировки окружностей по радиусу
    public void sortCirclesByRadius() {
        Arrays.sort(circles, (c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius()));
    }

    // Метод для вывода окружностей
    public void printCircles() {
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);

        System.out.println("Все окружности:");
        tester.printCircles();

        System.out.println("\nСамая маленькая окружность:");
        System.out.println(tester.findSmallestCircle());

        System.out.println("\nСамая большая окружность:");
        System.out.println(tester.findLargestCircle());

        System.out.println("\nОкружности, отсортированные по радиусу:");
        tester.sortCirclesByRadius();
        tester.printCircles();
    }
}
