package ru.mirea.practice.s23k0116.movable1;

public class MovablePoint implements Movable {
    public double x;
    public double y;
    public final double xspeed;
    public final double yspeed;

    public MovablePoint(double x, double y, double xspeed, double yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public void moveUp() {
        this.y += yspeed;
    }

    public void moveDown() {
        this.y -= yspeed;
    }

    public void moveLeft() {
        this.x -= xspeed;
    }

    public void moveRight() {
        this.x += xspeed;
    }

    public double getxYSpeed() {
        return xspeed;
    }

    public double getYSpeed() {
        return yspeed;
    }

    @Override
    public String toString() {
        return "Movable point:\n"
                + "x = " + x + "\n"
                + "y = " + y + "\n"
                + "xSpeed = " + xspeed + "\n"
                + "ySpeed = " + yspeed + "\n";
    }
}
