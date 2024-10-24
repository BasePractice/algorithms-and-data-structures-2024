package ru.mirea.practice.s0000001;

import java.awt.Color;
import java.awt.Graphics;

class Rectangle extends Shape {

    int width;
    int height;

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
