package mirea.lab2;

public class Circle {
    private Point center;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }

    public double[] getCenter() {
        return new double[]{this.center.getX(), this.center.getY()};
    }

    public void setCenter(double x, double y) {
        this.center.setXY(x, y);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "center=["
                + center.getX()
                + ","
                + center.getY()
                + "]"
                +
                ", radius="
                + radius
                + '}';
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
