package ru.mirea.practice.pr6;

public class MovableCircle implements Movable {
    private int radiusSize;
    private MovablePoint centerPoint;

    public MovableCircle(int x, int y, int speedX, int speedY, int radiusSize) {
        this.radiusSize = radiusSize;
        this.centerPoint = new MovablePoint(x, y, speedX, speedY);
    }

    @Override
    public void shiftUp() {
        centerPoint.shiftUp();
    }

    @Override
    public void shiftDown() {
        centerPoint.shiftDown();
    }

    @Override
    public void shiftLeft() {
        centerPoint.shiftLeft();
    }

    @Override
    public void shiftRight() {
        centerPoint.shiftRight();
    }

    @Override
    public String toString() {
        return "MoveableCircle{radius=" + radiusSize + ", center=" + centerPoint + '}';
    }
}
