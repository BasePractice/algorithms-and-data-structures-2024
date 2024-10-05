package ru.mirea.practice.s23L0908.Task2;

public class Ball {
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;

    public Ball() {
        this.x = 0.0f;
        this.y = 0.0f;
        this.xSpeed = 1.0f;
        this.ySpeed = 1.0f;
    }

    public Ball(float x, float y, float xSpeed, float ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void move() {
        x += xSpeed;
        y += ySpeed;
    }

    public void reverse() {
        xSpeed = -xSpeed;
        ySpeed = -ySpeed;
    }

    public String toString() {
        return "Ball {"+
            "x= "+x+
            ", y= "+y+
            ",xSpeed="+xSpeed+
            ",ySpeed="+ySpeed+"}";
    }
}
