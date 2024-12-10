package ru.mirea.practice.s23k0690;

import java.awt.Color;
import java.awt.Graphics;

abstract class Shape {
    protected Color color;
    protected int y;
    protected int x;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}
