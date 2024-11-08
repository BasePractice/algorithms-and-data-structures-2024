package ru.mirea.practice.s23f0011;

import java.awt.Color;
import java.awt.Graphics;

class Circle extends Shape {
    private final int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
