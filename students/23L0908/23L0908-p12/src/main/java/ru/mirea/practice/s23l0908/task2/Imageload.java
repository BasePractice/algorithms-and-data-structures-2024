package ru.mirea.practice.s23l0908.task2;

import java.awt.Canvas;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Color;

class Imageload extends Canvas {
    Image img;

    public Imageload(Image img) {
        this.img = img;
    }

    public void paint(Graphics g) {
        if (img != null) {
            g.drawImage(img, 10, 100, Color.BLACK, this);
        }
    }

    public void setImage(Image img) {
        this.img = img;
    }
}
