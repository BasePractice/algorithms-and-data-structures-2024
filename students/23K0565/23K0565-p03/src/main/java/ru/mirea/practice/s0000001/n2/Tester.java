package ru.mirea.practice.s0000001.n2;

import java.util.Arrays;
import java.util.Random;

public final class Tester {
    private Tester() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        int n = 5;
        Circle[] circles = new Circle[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            Point center = new Point(rnd.nextDouble() * 100, rnd.nextDouble() * 100);
            double radius = rnd.nextDouble() * 50;
            circles[i] = new Circle(center, radius);
        }

        Arrays.sort(circles, (a, b) -> Double.compare(a.getCircumference(), b.getCircumference()));

        System.out.println("Наименьшая окружность: " + circles[0].getCircumference());
        System.out.println("Наибольшая окружность: " + circles[n - 1].getCircumference());
    }
}