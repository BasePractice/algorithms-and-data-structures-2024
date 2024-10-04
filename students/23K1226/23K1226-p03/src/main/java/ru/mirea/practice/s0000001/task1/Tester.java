package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;

class Tester {
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
        }
    }

    public Circle getSmallestCircle() {
        Circle smallest = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < smallest.getRadius()) {
                smallest = circles[i];
            }
        }
        return smallest;
    }

    public Circle getLargestCircle() {
        Circle largest = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largest.getRadius()) {
                largest = circles[i];
            }
        }
        return largest;
    }

    public void sortCircles() {
        Arrays.sort(circles, 0, count, (c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius()));
    }

    public Circle[] getCircles() {
        return circles;
    }
}
