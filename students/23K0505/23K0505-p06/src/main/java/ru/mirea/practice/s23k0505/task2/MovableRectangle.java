package ru.mirea.practice.s23k0505.task2;

import ru.mirea.practice.s23k0505.task1.Movable;
import ru.mirea.practice.s23k0505.task1.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        if (topLeft.getxSpeed() != bottomRight.getxSpeed() || topLeft.getySpeed() != bottomRight.getySpeed()) {
            throw new RuntimeException(String.format("Speed mismatch error: trying to define a rectangle with topLeft %s and bottomRight %s",
                    topLeft, bottomRight));
        }
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
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
}
