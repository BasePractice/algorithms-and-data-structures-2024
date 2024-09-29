package ru.mirea.practice.s23k0350.task1;

import java.util.Arrays;
import java.util.Random;

class Tester {
    private Circle[] circles;
    public int size;

    public Tester(int size) {
        this.size = size;
        this.circles = new Circle[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            float x = random.nextFloat() * 100;
            float y = random.nextFloat() * 100;
            float radius = random.nextFloat() * 10;
            Point center = new Point(x, y);
            Circle circle = new Circle(center, radius);
            circles[i] = circle;
        }
    }

    public void printCircles() {
        for (Circle circle : circles) {
            System.out.println("Центр: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + "), Radius: " + circle.getRadius());
        }
    }

    public Circle getSmallestCircle() {
        Circle smallest = circles[0];
        for (Circle circle : circles) {
            if (circle.getRadius() < smallest.getRadius()) {
                smallest = circle;
            }
        }
        return smallest;
    }

    public Circle getLargestCircle() {
        Circle largest = circles[0];
        for (Circle circle : circles) {
            if (circle.getRadius() > largest.getRadius()) {
                largest = circle;
            }
        }
        return largest;
    }

    public void sortCircles() {
        Arrays.sort(circles, (c1, c2) -> Float.compare(c1.getRadius(), c2.getRadius()));
    }
}
