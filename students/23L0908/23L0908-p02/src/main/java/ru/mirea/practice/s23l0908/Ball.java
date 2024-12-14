package ru.mirea.practice.s23l0908;

public class Ball {
    private float x;
    private float y;
    private float xspeed;
    private float yspeed;

    @SuppressWarnings("unused")
    public Ball() {
        this.x = 0.0f;
        this.y = 0.0f;
        this.xspeed = 1.0f;
        this.yspeed = 1.0f;
    }

    public Ball(float x, float y, float xspeed, float yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public void move() {
        x += xspeed;
        y += yspeed;
    }

    public void reverse() {
        xspeed = -xspeed;
        yspeed = -yspeed;
    }

    public String toString() {
        return "Ball {"
            + "x= " + x
            + ", y= " + y
            + ",xSpeed=" + xspeed
            + ",ySpeed=" + yspeed
            + "}";
    }
}
