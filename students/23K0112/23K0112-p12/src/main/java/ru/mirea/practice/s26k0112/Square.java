package ru.mirea.practice.s26k0112;

import java.awt.Color;


class Square extends Shape {
    public int sideSize;

    public Square(String name, Color color, int x, int y, int sideSize) {
        super(name, color, x, y);
        this.sideSize = sideSize;
    }

    public void setSide(int newSide) {
        this.sideSize = newSide;
    }

    public int getSide() {
        return sideSize;
    }
}
