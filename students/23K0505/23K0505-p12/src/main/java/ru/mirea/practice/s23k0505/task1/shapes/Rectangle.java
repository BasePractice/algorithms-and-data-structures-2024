package ru.mirea.practice.s23k0505.task1.shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
        super(Color.black, true);
    }

    public Rectangle(Color color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(Color color, boolean filled, int width, int height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public void draw(int x, int y, Graphics2D g2d) {
        Color temp = g2d.getColor();
        g2d.setColor(this.getColor());
        if (isFilled()) {
            g2d.fillRect(x, y, width, height);
        } else {
            g2d.drawRect(x, y, width, height);
        }
        g2d.setColor(temp);
    }
}
