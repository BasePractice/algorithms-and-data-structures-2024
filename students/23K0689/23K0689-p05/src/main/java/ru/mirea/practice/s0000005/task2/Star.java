package ru.mirea.practice.s0000005.task2;

import java.awt.Color;
import java.awt.Graphics;

public class Star extends Shape {
    private int size;

    public Star(Color color, int x, int y, int size) {
        super(color, x, y);
        this.size = size;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);

        int[] xPoints = {
            a,
            a + size / 2,
            a + size,
            a + size * 3 / 4,
            a + size * 5 / 4,
            a + size / 2,
            a,
            a - size / 4,
            a - size / 2
        };

        int[] yPoints = {
            b + size,
            b + size / 4,
            b + size,
            b + size * 5 / 4,
            b + size * 3 / 4,
            b + size * 2,
            b + size * 3 / 4,
            b + size * 5 / 4,
            b + size
        };

        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }
}