package ru.mirea.practice.s23K0135;

/********************************************************************************
 * Создать класс точка Point, описывающий точку на плоскости. Создать           *
 * Circle класс, в котором одно поле представляет точку – центр окружности, и   *
 * добавить другие свойства, позволяющие задать точку на плоскости. Создать     *
 * третий класс Tester который использует для хранения объектов массив объектов *
 * Circle и второе поле количество элементов в массиве.                         *
 ********************************************************************************/

public abstract class Task3 {
    public static void main(String[] args) {
        Tester tester = new Tester(10);

        tester.addCircle(new Circle(new Point(37.0, 200.0), 104));
        tester.addCircle(new Circle(new Point(28.0, -10.0), 60));
        tester.addCircle(new Circle(new Point(16.0, -70.0), 8));
        tester.addCircle(new Circle(new Point(10.0, 20.0), 4));
        tester.addCircle(new Circle());

        tester.testCircles();

        System.out.println("Всего кружочков: " + tester.amount);
    }

    static class Point {
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point() {
            this.x = 0.0;
            this.y =  0.0;
        }

        @Override
        public String toString() {
            return "{ x=" + this.x + ", y=" + this.y + " }";
        }
    }

    static class Circle {
        Point center;
        double radius;

        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }

        public Circle() {
            this.center = new Point();
            this.radius = 1;
        }

        public void setCenter(Point center) {
            this.center = center;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "Circle { center=" + center + ", radius=" + radius + " }";
        }
    }

    static class Tester {
        Circle[] circles;
        int amount;

        public Tester(int amount) {
            this.circles = new Circle[amount];
            this.amount = 0;
        }

        public void addCircle(Circle circle) {
            this.circles[this.amount] = circle;
            this.amount++;
        }

        public void editCircle(int number, Circle circle) {
            if (1 < number && number > amount) {
                return;
            }

            this.circles[number] = circle;
        }

        public void testCircles() {
            for (int i = 0; i < this.amount; ++i) {
                System.out.println((i + 1) + "-ый кружочек: " + this.circles[i]);

                if (i == 0) {
                    this.circles[i].setCenter(new Point());
                } else {
                    this.circles[i].setCenter(new Point(i + 1, i - 1));
                }
                System.out.println((i + 1) + "-ый кружочек установлен в: " + this.circles[i].center);

                this.circles[i].setRadius(i + 1);
                System.out.println((i + 1) + "-ый кружочек получил радиус: " + this.circles[i].radius);

                System.out.println();
            }
        }
    }
}
