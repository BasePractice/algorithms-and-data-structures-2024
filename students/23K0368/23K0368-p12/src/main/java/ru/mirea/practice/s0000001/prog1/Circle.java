package ru.mirea.practice.s0000001.prog1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;

class Circle extends Shape {

    public Circle(Color color, Point position) {
        super(color, position);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x, position.y, 50, 50);
    }
}
