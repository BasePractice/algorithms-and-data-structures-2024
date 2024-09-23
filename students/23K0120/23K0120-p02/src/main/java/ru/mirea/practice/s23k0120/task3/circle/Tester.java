package ru.mirea.practice.s23k0120.task3.circle;

import java.util.Arrays;

public class Tester {
    private Circle[] circles;
    private int numOfObjects;
    public Tester(Circle[] circles) {
        this.circles = circles.clone();
        this.numOfObjects = this.circles.length;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "circles=" + Arrays.toString(circles) +
                ", numOfObjects=" + numOfObjects +
                '}';
    }

    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(new Point(i, i*2), Math.sqrt(i));
        }

        Tester tester = new Tester(circles);
        System.out.println(tester);
    }

}
