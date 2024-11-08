package ru.mirea.practice.s0000001;

import java.awt.Color;

class Rectangle extends Shape {
    public int width;
    public int length;

    public Rectangle(String name, Color color, int x, int y, int width, int length) {
        super(name, color, x, y);
        this.width = width;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }

}
