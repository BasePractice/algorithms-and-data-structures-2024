package ru.mirea.practice.s0000001.task1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape() {
        Random rand = new Random();
        this.color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        this.x = rand.nextInt(400);
        this.y = rand.nextInt(400);
    }

    public abstract void draw(Graphics g);
}
