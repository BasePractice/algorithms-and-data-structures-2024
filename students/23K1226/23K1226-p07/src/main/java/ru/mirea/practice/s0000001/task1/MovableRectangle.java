package ru.mirea.practice.s0000001.task1;

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        speedTest(); // Переименовано
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

    private void speedTest() { // Переименовано
        if (topLeft.getSpeed() != bottomRight.getSpeed()) {
            throw new IllegalArgumentException("Both points must have the same speed.");
        }
    }

    public String toString() {
        return "MovableRectangle [Top Left: " + topLeft + ", Bottom Right: " + bottomRight + "]";
    }
}
