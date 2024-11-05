package ru.mirea.practice.s23k0169.t3;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);
        Circle circle1 = new Circle(new Point(2.0, 6.0), 4.0);
        Circle circle2 = new Circle(new Point(5.0, 3.0), 2.0);

        tester.addCircle(circle1);
        tester.addCircle(circle2);

        tester.dispCircles();
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив уже заполнен");
        }
    }

    public void dispCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }
}

