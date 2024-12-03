package ru.mirea.practice.s0000001.task3;

import java.awt.Color;
import java.awt.Graphics;

abstract class AnimatedShape {
    protected Color color;
    protected int x;
    protected int y;
    protected int dx;
    protected int dy;

    public AnimatedShape(Color color, int x, int y, int dx, int dy) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }

    public abstract void draw(Graphics g);

    public void move(int width, int height) {
        x += dx;
        y += dy;
        if (x < 0 || x > width) {
            dx = -dx;
        }
        if (y < 0 || y > height) {
            dy = -dy;
        }
    }
}
