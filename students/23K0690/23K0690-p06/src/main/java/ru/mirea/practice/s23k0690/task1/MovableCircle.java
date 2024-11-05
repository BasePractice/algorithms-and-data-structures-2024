package ru.mirea.practice.s23k0690.task1;

class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;

    public MovableCircle(MovablePoint center, int radius) {
        super(center.getX(), center.getY(), center.getXspeed(), center.getYspeed());
        if (center == null) {
            throw new IllegalArgumentException("Center point cannot be null");
        }
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
        super.moveLeft(); // Move the circle itself
    }

    @Override
    public void moveRight() {
        center.moveRight();
        super.moveRight(); // Move the circle itself
    }

    @Override
    public void moveUp() {
        center.moveUp();
        super.moveUp(); // Move the circle itself
    }

    @Override
    public void moveDown() {
        center.moveDown();
        super.moveDown(); // Move the circle itself
    }

    @Override
    public String toString() {
        return "MovableCircle "
                + "radius=" + getRadius()
                + ", centerX=" + center.getX()
                + ", centerY=" + center.getY()
                + ", xspeed=" + getXspeed()
                + ", yspeed=" + getYspeed();
    }
}