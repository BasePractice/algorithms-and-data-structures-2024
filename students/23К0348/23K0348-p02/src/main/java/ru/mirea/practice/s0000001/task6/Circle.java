package ru.mirea.practice.s0000001.task6;


class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public boolean equals(Circle other) {
        return this.radius == other.radius;
    }
}

class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);

        System.out.println("Area: " + circle1.area());
        System.out.println("Circumference: " + circle1.circumference());
        System.out.println("Circles are equal: " + circle1.equals(circle2));
    }
}

