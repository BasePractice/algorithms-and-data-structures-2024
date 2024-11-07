package mirea.lab9.task3;

public class Circle extends Point {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "y=" + y + ", x=" + x + ", radius=" + radius + '}';
    }
}
