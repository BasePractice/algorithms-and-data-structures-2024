package ru.mirea.practice.s24k0112;

import java.awt.Color;

class Circle extends Shape {
    public int radius;

    public Circle(String name, Color color, int x, int y, int radius) {
        super(name, color, x, y);
        this.radius = radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public int getRadius() {
        return radius;
    }


}
