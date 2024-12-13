package ru.mirea.practice.s0000001.num2;

public final class Main {

    private Main() {
        // Приватный конструктор для предотвращения создания экземпляра класса
    }

    public static class Point {
        private double x;
        private double y;
        private double speed;

        public Point(double x, double y, double speed) {
            this.x = x;
            this.y = y;
            this.speed = speed;
        }

        public String toString() {
            return "Point(" + x + ", " + y + ") with speed " + speed;
        }

        public boolean speedTest(Point p) {
            return this.speed == p.speed;
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 2, 30);
        Point p2 = new Point(3, 4, 30);
        Point p3 = new Point(5, 6, 40);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println("p1 and p2 have same speed: " + p1.speedTest(p2));
        System.out.println("p1 and p3 have same speed: " + p1.speedTest(p3));
    }
}

