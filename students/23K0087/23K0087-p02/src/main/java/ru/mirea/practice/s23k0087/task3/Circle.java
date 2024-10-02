package ru.mirea.practice.s23k0087.task3;

public class Circle {
    private double radius;
    private Point center;

    public Circle(double radius, Point center) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        if (radius < 0) {
            System.out.println("Радиус не может быть меньше 0");
            return 0;
        }
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }   

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }       

    public String toString() {
        return "Circle[radius = " + radius + "m, center = " + center + "]";
    }
}
