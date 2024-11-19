package ru.mirea.practice.s23k0135.task1;

import java.awt.Color;
import java.awt.Graphics;

class Triangle extends Shape {
    private int[] xPoints;
    private int[] yPoints;

    public Triangle(Color color, int x, int y, int base, int height) {
        super(color, x, y);
        xPoints = new int[] {x, x + base / 2, x - base / 2};
        yPoints = new int[] {y, y - height, y - height};
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}

