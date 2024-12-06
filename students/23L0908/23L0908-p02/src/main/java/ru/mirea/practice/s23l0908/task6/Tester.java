package ru.mirea.practice.s23l0908.task6;

public final class Tester {

    // Private constructor to indicate no instantiation for utility purposes.
    private Tester() {

    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);
        Circle circle3 = new Circle(5.0);

        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Circle 3: " + circle3);
        System.out.println("Circle 1 is equal to Circle 2: " + circle1.isEqual(circle2));
        System.out.println("Circle 1 is equal to Circle 3: " + circle1.isEqual(circle3));

        circle2.setRadius(5.0);

        System.out.println("\nAfter changing radius of Circle 2: " + circle2);
        System.out.println("Circle 1 is equal to Circle 2: " + circle1.isEqual(circle2));
    }
}

