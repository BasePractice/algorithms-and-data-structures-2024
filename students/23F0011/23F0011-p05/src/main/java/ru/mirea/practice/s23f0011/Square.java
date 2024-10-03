package ru.mirea.practice.s23f0011;

import java.awt.Color;
import java.awt.Graphics2D;

class Square extends Shape {
    private final int side;

    public Square(Color color, int x, int y, int side) {
        super(color, x, y);
        this.side = side;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillRect(x, y, side, side);
    }
}

