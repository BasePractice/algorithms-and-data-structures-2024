package ru.mirea.practice.s23k0690.task2;

public class MovableRectangle {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        topLeft = new MovablePoint(topLeftX, topLeftY);
        bottomRight = new MovablePoint(bottomRightX, bottomRightY);
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public void printPosition() {
        System.out.println("(" + topLeft.getX() + ", " + topLeft.getY() + ")");
        System.out.println("(" + bottomRight.getX() + ", " + bottomRight.getY() + ")");
    }
}
