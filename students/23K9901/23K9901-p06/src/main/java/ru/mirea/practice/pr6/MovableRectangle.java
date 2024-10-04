package ru.mirea.practice.pr6;

public class MovableRectangle implements Movable {
    private MovablePoint topLeftCorner;
    private MovablePoint bottomRightCorner;

    public MovableRectangle(int x1, int y1, int x2, int y2, int speedX, int speedY) {
        this.topLeftCorner = new MovablePoint(x1, y1, speedX, speedY);
        this.bottomRightCorner = new MovablePoint(x2, y2, speedX, speedY);
    }

    private boolean isSpeedEqual() {
        return topLeftCorner.speedX == bottomRightCorner.speedX && topLeftCorner.speedY == bottomRightCorner.speedY;
    }

    @Override
    public void shiftUp() {
        if (isSpeedEqual()) {
            topLeftCorner.shiftUp();
            bottomRightCorner.shiftUp();
        } else {
            System.out.println("Corners move at different speeds.");
        }
    }

    @Override
    public void shiftDown() {
        if (isSpeedEqual()) {
            topLeftCorner.shiftDown();
            bottomRightCorner.shiftDown();
        } else {
            System.out.println("Corners move at different speeds.");
        }
    }

    @Override
    public void shiftLeft() {
        if (isSpeedEqual()) {
            topLeftCorner.shiftLeft();
            bottomRightCorner.shiftLeft();
        } else {
            System.out.println("Corners move at different speeds.");
        }
    }

    @Override
    public void shiftRight() {
        if (isSpeedEqual()) {
            topLeftCorner.shiftRight();
            bottomRightCorner.shiftRight();
        } else {
            System.out.println("Corners move at different speeds.");
        }
    }

    @Override
    public String toString() {
        return "MoveableRectangle{topLeft=" + topLeftCorner + ", bottomRight=" + bottomRightCorner + '}';
    }
}
