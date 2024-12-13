package ru.mirea.practice.s0000001.num1;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
    int r;

    public Circle(int x, int y, Color color, int r) {
        super(x, y, color);
        this.r = r;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - r / 2, y - r / 2, r, r);  // Центрирование круга
    }
}
