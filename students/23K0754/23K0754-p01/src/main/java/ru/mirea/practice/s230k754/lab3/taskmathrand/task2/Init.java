package ru.mirea.practice.s230k754.lab3.taskmathrand.task2;

public final class Init {
    private Init() {}

    public static void main(String[] args) {
        Circle c1 = new Circle(Math.random(), Math.random(), Math.random());
        Point p1 = new Point(Math.random(), Math.random());
        Tester t1 = new Tester(1);

        t1.sort();
        System.out.println(c1.getRadius() + " " + p1.getY() + " " + p1.getX());

    }
}
