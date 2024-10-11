package mirea.lab9.task2;

public class Ball {
    private double x;
    private double y;

    public Ball() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xxxDis, double yyyDisp) {
        this.x += xxxDis;
        this.y += yyyDisp;
    }

    @Override
    public String toString() {
        return "Ball(x: " + this.x + ", y: " + this.y + ")";
    }
}
