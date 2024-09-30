package ru.mirea.practice.s230k754.lab5.task2;

import java.awt.Color;
import java.util.Random;

public abstract class Shape {
    private static final Color[] colors = new Color[] {Color.BLACK, Color.BLUE, Color.GREEN};
    private static final Random r = new Random();
    private Color color;
    private int x;
    private int y;

    public Shape() {
        this.color = colors[r.nextInt(3)];
        this.x = r.nextInt(200);
        this.y = r.nextInt(200);
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static Random getR() {
        return r;
    }
}
