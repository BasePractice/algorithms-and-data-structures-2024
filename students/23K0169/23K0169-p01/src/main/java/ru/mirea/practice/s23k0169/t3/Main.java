package ru.mirea.practice.s23k0169.t3;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);
        Circle circle1 = new Circle(new Point(2.0, 6.0), 4.0);
        Circle circle2 = new Circle(new Point(5.0, 3.0), 2.0);

        tester.addCircle(circle1);
        tester.addCircle(circle2);

        tester.dispCircles();
    }
}
