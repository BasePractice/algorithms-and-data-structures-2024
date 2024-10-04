package ru.mirea.practice.s23k0087.task2;


import ru.mirea.practice.s23k0087.task1.Movable;
import ru.mirea.practice.s23k0087.task1.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        if (!haveSameSpeed()) {
            throw new IllegalArgumentException("Точки должны иметь одинаковую скорость.");
        }
    }

    private boolean haveSameSpeed() {
        return topLeft.getSpeedX() == bottomRight.getSpeedX() && topLeft.getSpeedY() == bottomRight.getSpeedY();
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

    public String toString() {
        return "Movable rectangle:\n"
                + "topLeft: " + topLeft + '\n'
                + "bottonRight: " + bottomRight + '\n';
    }

}
