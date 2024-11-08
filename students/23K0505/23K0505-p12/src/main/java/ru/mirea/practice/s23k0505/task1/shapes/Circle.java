package ru.mirea.practice.s23k0505.task1.shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circle extends Shape {
    int r;

    public Circle() {
        super(Color.black, true);
    }

    public Circle(Color color, boolean filled) {
        super(color, filled);
    }

    public Circle(Color color, boolean filled, int r) {
        super(color, filled);
        this.r = r;
    }

    public void draw(int x, int y, Graphics2D g2d) {
        Color temp = g2d.getColor();
        g2d.setColor(this.getColor());
        if (isFilled()) {
            g2d.fillOval(x, y, r, r);
        } else {
            g2d.drawOval(x, y, r, r);
        }
        g2d.setColor(temp);
    }

    public void setR(int r) {
        this.r = r;
    }
}
