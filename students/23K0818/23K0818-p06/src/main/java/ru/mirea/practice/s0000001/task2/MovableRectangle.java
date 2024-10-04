package ru.mirea.practice.s0000001.task2;


public class MovableRectangle implements Movable {
    private MovablePoint2 topLeft;
    private MovablePoint2 bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        this.topLeft = new MovablePoint2(x1, y1, xspeed, yspeed);
        this.bottomRight = new MovablePoint2(x2, y2, xspeed, yspeed);
        if (!checkspeeds()) {
            throw new IllegalArgumentException("Points must have the same speed");
        }
    }

    private boolean checkspeeds() {
        return topLeft.getXspeed() == bottomRight.getXspeed() && topLeft.getYspeed() == bottomRight.getYspeed();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}