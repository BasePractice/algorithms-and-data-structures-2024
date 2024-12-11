package ru.mirea.practice.s0000005.task2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class PolygonShape extends Polygon {
    private Color color;

    public PolygonShape(int x, int y, Color color) {
        this.color = color;

        // Define the shape of the polygon (triangle)
        addPoint(x, y);
        addPoint(x + 30, y + 20);
        addPoint(x + 15, y + 40);
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(this);
    }
}