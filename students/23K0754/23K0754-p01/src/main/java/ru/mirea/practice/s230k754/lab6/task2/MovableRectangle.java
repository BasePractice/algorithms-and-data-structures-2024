package ru.mirea.practice.s230k754.lab6.task2;

import ru.mirea.practice.s230k754.lab6.task1.MovablePoint;

import java.util.Objects;

public class MovableRectangle extends MovablePoint {
    private MovablePoint toleft;
    private MovablePoint bottomright;

    public MovableRectangle(int x, int y, int x1, int y1, int xspeed, int yspeed) {
        super(x, y, xspeed, yspeed);
        this.toleft = new MovablePoint(x, y, xspeed, yspeed);
        this.bottomright = new MovablePoint(x1, y1, xspeed, yspeed);
    }

    public boolean checkerSpeed(int xspeed, int yspeed) {
        return Objects.equals(xspeed, yspeed);
    }

    public MovablePoint getBottomright() {
        return bottomright;
    }

    public MovablePoint getToleft() {
        return toleft;
    }
}
