package ru.mirea.practice.s23f0011.task2;

import java.awt.Color;
import java.awt.Graphics2D;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics2D g2d);
}
