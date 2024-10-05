package ru.mirea.practice.s23L0908.task3;

public class Tester {
    private Circle[] circles;
    private int numberOfCircles;

    public Tester(int size) {
        circles = new Circle[size];
        numberOfCircles = 0;
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);
        tester.addCircle(new Circle(new Point(0, 0), 5));
        tester.addCircle(new Circle(new Point(2, 3), 10));
        tester.printCircles();
    }

    public void addCircle(Circle circle) {
        if (numberOfCircles < circles.length) {
            circles[numberOfCircles++] = circle;
        }
    }

    public void printCircles() {
        for (int i = 0; i < numberOfCircles; i++) {
            System.out.println(circles[i]);
        }
    }
}
