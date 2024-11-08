package ru.mirea.practice.s0000001.prog1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

class Square extends Shape {

    public Square(Color color, Point position) {
        super(color, position);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x, position.y, 50, 50);
    }
}
