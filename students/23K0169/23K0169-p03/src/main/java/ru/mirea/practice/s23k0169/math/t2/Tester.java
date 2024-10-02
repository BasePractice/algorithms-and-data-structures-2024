package ru.mirea.practice.s23k0169.math.t2;

import java.util.Random;

class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Tester tester = new Tester(5);

        for (int i = 0; i < 5; i++) {
            Point center = new Point(rand.nextDouble() * 10, rand.nextDouble() * 10);
            double radius = rand.nextDouble() * 5;
            Circle circle = new Circle(center, radius);
            tester.addCircle(circle);
        }

        Circle smallest = tester.findSmallestCircle();
        Circle largest = tester.findLargestCircle();

        System.out.println("Самая маленькая окружность, радиус: " + smallest.getRadius());
        System.out.println("Самая большая окружность, радиус: " + largest.getRadius());

        tester.sortCircles();
        System.out.println("Окружности отсортированы по радиусу.");
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count++] = circle;
        } else {
            System.out.println("Массив заполнен!");
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

    public void sortCircles() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (circles[j].getRadius() > circles[j + 1].getRadius()) {
                    // Обмен элементов
                    Circle temp = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = temp;
                }
            }
        }
    }
}

