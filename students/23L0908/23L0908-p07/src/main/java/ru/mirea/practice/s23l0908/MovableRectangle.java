package ru.mirea.practice.s23l0908;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
        bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{"
            + "topLeft="
            + topLeft
            + ", bottomRight="
            + bottomRight
            + '}';
    }

    @Override
    public void moveDown() {
        System.out.println("Rectangle move down!");
        topLeft.y -= topLeft.yspeed;
        bottomRight.y -= bottomRight.yspeed;
    }

    @Override
    public void moveRight() {
        System.out.println("Rectangle move right!");
        topLeft.x += topLeft.xspeed;
        bottomRight.x += bottomRight.xspeed;
    }

    @Override
    public void moveUp() {
        System.out.println("Rectangle move up!");
        topLeft.y += topLeft.yspeed;
        bottomRight.y += bottomRight.yspeed;
    }

    @Override
    public void moveLeft() {
        System.out.println("Rectangle move left!");
        topLeft.x -= topLeft.xspeed;
        bottomRight.x -= bottomRight.xspeed;
    }

    public boolean speedtest() {
        return topLeft.xspeed == topLeft.yspeed & bottomRight.xspeed == bottomRight.yspeed;
    }
}
