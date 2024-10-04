package ru.mirea.practice.s23k0350.task1;

public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xspeed;
    public int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXspeed() {
        return xspeed;
    }

    public int getYspeed() {
        return yspeed;
    }

    public void moveUp() {
        y += yspeed;
    }

    public void moveDown() {
        y -= yspeed;
    }

    public void moveLeft() {
        x -= xspeed;
    }

    public void moveRight() {
        x += xspeed;
    }

    @Override
    public String toString() {
        return "Ваша точка: координаты"
                + getX()
                + getY()
                + "со скоростью"
                + getXspeed()
                + getYspeed();
    }
}