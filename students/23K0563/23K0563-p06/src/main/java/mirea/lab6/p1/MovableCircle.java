package mirea.lab6.p1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        this.center.setX(x);
        this.center.setY(y);
        this.center.setXspeed(xspeed);
        this.center.setYspeed(yspeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{"
                + "radius="
                + radius
                + ", center="
                + center.toString()
                + '}';
    }
}
