package ru.mirea.practice.s23k0169.math.t2;

import java.util.Random;

public final class Main {

    private Main() {

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

        System.out.println("Самая маленькая окружность радиус: " + smallest.getRadius());
        System.out.println("Самая большая окружность радиус: " + largest.getRadius());

        tester.sortCircles();
        System.out.println("Окружности отсортированы по радиусу.");
    }
}
