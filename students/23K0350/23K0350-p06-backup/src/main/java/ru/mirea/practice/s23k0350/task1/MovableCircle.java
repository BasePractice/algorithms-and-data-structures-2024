package ru.mirea.practice.s23k0350.task1;

class MovableCircle extends MovablePoint {
    int radius;
    MovablePoint center;

    public MovableCircle(MovablePoint center, int radius) {
        super(center.x, center.y, center.xspeed, center.yspeed);
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public String toString() {
        return "Ваш круг: радиус "
                + getRadius()
                + " координаты центра: "
                + getX()
                + " "
                + getY()
                + " "
                + "со скоростью "
                + getXspeed()
                + " "
                + getYspeed();

    }
}