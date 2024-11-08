package ru.mirea.practice.s0000001.task1;

import java.awt.Color;
import java.awt.Graphics;

class Rectangle extends Shape {
    public Rectangle(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, 40, 20);
    }

}
