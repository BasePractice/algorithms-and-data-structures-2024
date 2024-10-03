package ru.mirea.practice.s0000002;

/**
 * Необходимо реализовать простейший класс Shape (Фигура).
 * Добавьте метод класса getType() (тип фигуры, возвращает строку тип String
 * название фигуры). С помощью наследования создайте дочерние классы Circle,
 * Rectangle и Square. (из предыдущей практической работы). Также реализуйте во
 * всех классах методы getArea()(возвращает площадь фигуры), getPerimeter()
 * взвращает периметр фигуры). Переопределите в дочерних класс методы класса
 * родителя toString(), getArea(), getPerimeter() и getType(). Создать класс-тестер
 * для вывода информации об объекте и продемонстирировать вызов методов
 * использую родительскую ссылку. Объяснить работу программы.
 */

public abstract class Task1 {
    public static void main(String[] args) {
        new Tester().run();
    }


    static class Tester {
        void run() {
            System.out.println("Testing things!");

            final Shape circle = new Circle();
            final Shape rectangle = new Rectangle();
            final Shape square = new Square();

            if (circle instanceof Circle) {
                System.out.println("This is always TRUE.");
            }

            System.out.println(circle);
            System.out.println(circle.getType());
            System.out.println(circle.getArea());
            System.out.println(circle.getPerimeter());

            System.out.println(rectangle);
            System.out.println(rectangle.getType());
            System.out.println(rectangle.getArea());
            System.out.println(rectangle.getPerimeter());

            System.out.println(square);
            System.out.println(square.getType());
            System.out.println(square.getArea());
            System.out.println(square.getPerimeter());
        }
    }

    abstract static class Shape {
        String type = "Shape";

        public String getType() {
            return this.type;
        }

        abstract double getArea();

        abstract double getPerimeter();

        @Override
        public String toString() {
            return "Shape{ type='" + this.type + '\'' + " }";
        }
    }

    static class Circle extends Shape {
        double radius;

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Shape { " + "type='" + type + '\'' + ", radius=" + radius + " } ";
        }

        public Circle(double radius) {
            this.radius = radius;
            this.type = "Circle";
        }

        public Circle() {
            this(1.0);
        }
    }

    static class Rectangle extends Shape {
        double a;
        double b;

        @Override
        double getPerimeter() {
            return 2 * (a + b);
        }

        @Override
        double getArea() {
            return a * b;
        }

        @Override
        public String toString() {
            return "Shape { " + "type='" + type + '\'' + ", size=" + a + "x" + b + " } ";
        }

        public Rectangle(double a, double b) {
            this.a = a;
            this.b = b;
            this.type = "Rectangle";
        }

        public Rectangle() {
            this(1.0, 1.0);
        }
    }

    static class Square extends Rectangle {
        public Square(double a) {
            this.a = a;
            this.b = a;
            this.type = "Square";
        }

        public Square() {
            this(1.0);
        }
    }
}