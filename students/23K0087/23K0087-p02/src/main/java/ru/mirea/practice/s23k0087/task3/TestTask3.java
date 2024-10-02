package ru.mirea.practice.s23k0087.task3;

public abstract class TestTask3 {
    public static void main(String[] args) {
        Tester tester = new Tester(3);
        tester.addCircle(new Circle(10, new Point(10, 20)));
        tester.addCircle(new Circle(30, new Point(30, -25)));
        tester.addCircle(new Circle(-10, new Point(-10, 60)));
        System.out.println("Количество кругов: " + tester.getSize());
        tester.printCircles();

        Point point = new Point(10, 0);
        System.out.println("Координаты точки: " + point.getX() + " " + point.getY());
        point.setXY(-5, 20);
        System.out.println("Новые координаты точки: " + point.getX() + " " + point.getY());
    }
}
