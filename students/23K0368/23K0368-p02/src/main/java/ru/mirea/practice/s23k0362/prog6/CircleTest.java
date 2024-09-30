package ru.mirea.practice.s23k0362.prog6;

import java.util.Scanner;

public abstract class CircleTest {
    public static void compare(Double s1, Double s2) {
        if (s1 > s2) {
            System.out.println(s1 + " > " + s2 + "Первая окружность больше");
        } else if (s1 < s2) {
            System.out.println(s1 + " < " + s2 + "Вторая окружность больше");
        } else {
            System.out.println(s1 + " == " + s2 + "Окружности равны");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius of the circle: ");
            double r = sc.nextDouble();
            Circle c = new Circle(r);
            System.out.println(c);

            System.out.println("Enter the circle radius: ");
            double r2 = sc.nextDouble();
            Circle c2 = new Circle(r2);
            System.out.println(c2);

            compare(c.square(r), c2.square(r2));
        }
    }
}
