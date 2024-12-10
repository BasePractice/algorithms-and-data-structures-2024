package ru.mirea.practice.s0000001.task3;

import java.awt.Color;
import java.awt.Graphics;

class Circle extends AnimatedShape {
    public Circle(Color color, int x, int y, int dx, int dy) {
        super(color, x, y, dx, dy);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 30, 30);
    }

}
