package ru.mirea.practice.s0000001.task2;

class MovablePoint {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
}

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        if (topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed) {
            throw new IllegalArgumentException("Both points must have the same speed.");
        }
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
        return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }
}

class MovableTest {
    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(0, 10, 2, 2);
        MovablePoint bottomRight = new MovablePoint(5, 0, 2, 2);
        MovableRectangle rectangle = new MovableRectangle(topLeft, bottomRight);

        System.out.println(rectangle);
        rectangle.moveDown();
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}