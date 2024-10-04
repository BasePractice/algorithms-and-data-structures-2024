package mirea.lab6.p1;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xspeed;
    private int yspeed;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXspeed(int xspeed) {
        this.xspeed = xspeed;
    }

    public void setYspeed(int yspeed) {
        this.yspeed = yspeed;
    }

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{"
                + "x="
                + x
                + ", y="
                + y
                + ", xSpeed="
                + xspeed
                + ", ySpeed="
                + yspeed
                + '}';
    }

    @Override
    public void moveUp() {
        this.y += 1;
    }

    @Override
    public void moveDown() {
        this.y -= 1;
    }

    @Override
    public void moveLeft() {
        this.x -= 1;
    }

    @Override
    public void moveRight() {
        this.x += 1;
    }
}
