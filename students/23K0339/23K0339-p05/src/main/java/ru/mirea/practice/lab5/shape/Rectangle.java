package ru.mirea.practice.lab5.shape;

import java.awt.Color;
import java.awt.Graphics;

class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

