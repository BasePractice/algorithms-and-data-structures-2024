package ru.mirea.practice.s0000001.n3;

public class Tester {
    private Circle[] circles;
    private int numberOfCircles;

    public Tester(int size) {
        circles = new Circle[size];
        numberOfCircles = 0;
    }

    public void addCircle(Circle circle) {
        if (numberOfCircles < circles.length) {
            circles[numberOfCircles++] = circle;
        } else {
            System.out.println("Cannot add more circles, array is full.");
        }
    }

    public void displayCircles() {
        for (int i = 0; i < numberOfCircles; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(3);

        tester.addCircle(new Circle(new Point(1.0, 2.0), 5.0));
        tester.addCircle(new Circle(3.0, 4.0, 7.0));
        tester.addCircle(new Circle(new Point(0.0, 0.0), 2.5));

        tester.displayCircles();
    }
}