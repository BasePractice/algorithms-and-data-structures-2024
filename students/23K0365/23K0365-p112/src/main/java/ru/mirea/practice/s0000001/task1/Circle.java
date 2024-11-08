package ru.mirea.practice.s0000001.task1;

import java.awt.Color;
import java.awt.Graphics;

class Circle extends Shape {
    public Circle(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 30, 30);
    }

}
