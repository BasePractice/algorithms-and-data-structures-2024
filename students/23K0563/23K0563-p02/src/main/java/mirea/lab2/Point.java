package mirea.lab2;

public class Point {
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{"
                + "x="
                + x
                + ", y="
                + y
                + '}';
    }

    private double x;
    private double y;

}
