package ru.mirea.practice.s23k0505.task1.shapes;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Shape {
    private boolean filled;
    private Color color;

    public Shape(Color color, boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    public void draw(Graphics2D g2d) {
        // Method body entirely depends on child class
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
