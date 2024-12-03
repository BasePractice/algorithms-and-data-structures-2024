package ru.mirea.practice.s23k0505.task1.shapes;

import java.awt.Color;

public class Square extends Rectangle {
    int side;

    public Square() {
        super(Color.black, true);
    }

    public Square(Color color, boolean filled, int side) {
        super(color, filled, side, side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
