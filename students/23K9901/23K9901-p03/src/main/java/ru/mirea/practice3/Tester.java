package ru.mirea.practice3;

import java.util.Arrays;
import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int numberOfCircles;

    public Tester(int size) {
        circles = new Circle[size];
        numberOfCircles = 0;
    }

    public void addCircle(Circle circle) {
        if (numberOfCircles < circles.length) {
            circles[numberOfCircles] = circle;
            numberOfCircles++;
        } else {
            System.out.println("Массив окружностей заполнен.");
        }
    }

    public Circle findSmallestCircle() {
        if (numberOfCircles == 0) return null;
        Circle smallest = circles[0];
        for (int i = 1; i < numberOfCircles; i++) {
            if (circles[i].getRadius() < smallest.getRadius()) {
                smallest = circles[i];
            }
        }
        return smallest;
    }

    public Circle findLargestCircle() {
        if (numberOfCircles == 0) return null;
        Circle largest = circles[0];
        for (int i = 1; i < numberOfCircles; i++) {
            if (circles[i].getRadius() > largest.getRadius()) {
                largest = circles[i];
            }
        }
        return largest;
    }

    public void sortCircles() {
        Arrays.sort(circles, 0, numberOfCircles, (a, b) -> Double.compare(a.getRadius(), b.getRadius()));
    }

    public void printCircles() {
        for (int i = 0; i < numberOfCircles; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
Tester tester = new Tester(5);
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
double x = random.nextDouble() * 100;
double y = random.nextDouble() * 100;
double radius = random.nextDouble() * 50;
            tester.addCircle(new Circle(new Point(x, y), radius));
        }

        System.out.println("Все окружности:");
        tester.printCircles();

        Circle smallest = tester.findSmallestCircle();
        System.out.println("Самая маленькая окружность: " + smallest);

        Circle largest = tester.findLargestCircle();
        System.out.println("Самая большая окружность: " + largest);

        tester.sortCircles();
        System.out.println("Отсортированные окружности:");
        tester.printCircles();
    }
}

