package ru.mirea.practice.s23f0011;

import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;

class Circle extends Shape {
    private final int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fill(new Ellipse2D.Double(x - radius, y - radius, radius * 2, radius * 2));
    }
}
