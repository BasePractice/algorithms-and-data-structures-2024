package ru.mirea.practice.s0000001;

public class Circle {
    private Point mid;
    private int r;

    public Circle(Point mid, int r) {
        this.mid = mid;
        this.r = r;
    }

    public double[] getCoord() {
        return new double[]{mid.getX(), mid.getY()};
    }

    public int getR() {
        return r;
    }

    public void setX(double x) {
        this.mid.setX(x);
    }

    public void setY(double y) {
        this.mid.setY(y);
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getLength() {
        return 2 * Math.PI * this.r;
    }
}
