package ru.mirea.practice.s0000001;


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
