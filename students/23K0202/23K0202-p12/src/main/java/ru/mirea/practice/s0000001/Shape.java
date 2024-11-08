package ru.mirea.practice.s0000001;

import java.awt.Color;


abstract class Shape {
    public String name;
    public Color color;
    public int x;
    public int y;

    public Shape(String name, Color color, int x, int y) {
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public String getName() {
        return name;
    }

    public int getY() {
        return y;
    }

    public void setColor(Color newColor) {
        this.color = newColor;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }
}
