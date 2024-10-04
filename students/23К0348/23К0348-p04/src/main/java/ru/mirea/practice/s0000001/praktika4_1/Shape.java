package ru.mirea.practice.s0000001.praktika4_1;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape: " + color + ", Filled: " + filled;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String getType() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Circle: Radius = " + radius + ", Color = " + color + ", Filled = " + filled;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle: Length = " + length + ", Width = " + width + ", Color = " + color + ", Filled = " + filled;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side, "Default Color", true);
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square: Side = " + getLength() + ", Color = " + getColor() + ", Filled = " + isFilled();
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());

        Shape s2 = new Rectangle(1.0, 2.0, "BLUE", true);
        System.out.println(s2);
        System.out.println("Area: " + s2.getArea());
        System.out.println("Perimeter: " + s2.getPerimeter());

        Shape s3 = new Square(6.6);
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());
    }
}
