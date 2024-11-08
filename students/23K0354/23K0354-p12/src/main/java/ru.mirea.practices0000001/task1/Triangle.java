package ru.mirea.practices0000001.task1;

import java.awt.Color;
import java.awt.Graphics;

class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {x, x + width, x + width / 2};
        int[] yPoints = {y + height, y + height, y};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
