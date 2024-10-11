package ru.mirea.practice.s23k0690;

public final class Task141 {
    abstract static class Shape {
        abstract String getType();

        abstract double getArea();

        abstract double getPerimeter();

        @Override
        public String toString() {
            return "Shape type: " + getType() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
        }
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        String getType() {
            return "Circle";
        }

        @Override
        double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return super.toString() + ", Radius: " + radius;
        }
    }

    static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        String getType() {
            return "Rectangle";
        }

        @Override
        double getArea() {
            return width * height;
        }

        @Override
        double getPerimeter() {
            return 2 * (width + height);
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        @Override
        public String toString() {
            return super.toString() + ", Width: " + width + ", Height: " + height;
        }
    }

    static class Square extends Rectangle {
        public Square(double side) {
            super(side, side);
        }

        @Override
        String getType() {
            return "Square";
        }

        @Override
        public String toString() {
            return super.toString() + ", Side: " + super.getWidth();
        }
    }

    abstract static class ShapeTester {
        public static void main(String[] args) {
            Shape circle = new Circle(5);
            Shape rectangle = new Rectangle(4, 6);
            Shape square = new Square(3);

            Shape[] shapes = {circle, rectangle, square};

            for (Shape shape : shapes) {
                System.out.println(shape);
            }
        }
    }
}
