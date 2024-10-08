package ru.mirea.practice.s23K0135;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    private Circle[] circles;
    private int count;

    public Ex2() {
        this.count = (int) (Math.random() * 10);
        this.circles = new Circle[count];
        initializeCircles();
    }

    private void initializeCircles() {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            Point center = new Point(random.nextInt(100), random.nextInt(100));
            int radius = random.nextInt(100);
            circles[i] = new Circle(center, radius);
        }
    }

    public Circle findSmallestCircle() {
        Circle smallest = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < smallest.getRadius()) {
                smallest = circles[i];
            }
        }
        return smallest;
    }

    public Circle findLargestCircle() {
        Circle largest = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largest.getRadius()) {
                largest = circles[i];
            }
        }
        return largest;
    }

    public void sortCirclesByRadius() {
        Arrays.sort(circles, (c1, c2) -> Integer.compare((int) c1.getRadius(), (int) c2.getRadius()));
    }

    public void displayCircles() {
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }

    public static void main(String[] args) {
        Ex2 tester = new Ex2();

        System.out.println("Окружности:");
        tester.displayCircles();

        System.out.println("\nСамая маленькая окружность:");
        System.out.println(tester.findSmallestCircle());

        System.out.println("\nСамая большая окружность:");
        System.out.println(tester.findLargestCircle());

        System.out.println("\nОкружности после сортировки по радиусу:");
        tester.sortCirclesByRadius();
        tester.displayCircles();
    }
}
