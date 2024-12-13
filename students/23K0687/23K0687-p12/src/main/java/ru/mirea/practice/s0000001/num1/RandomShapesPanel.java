package ru.mirea.practice.s0000001.num1;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class RandomShapesPanel extends JPanel {
    private Shape[] shapes = new Shape[20];
    private Random rand = new Random();

    public RandomShapesPanel() {
        for (int i = 0; i < 20; i++) {
            int x = rand.nextInt(500);
            int y = rand.nextInt(500);
            Color c = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            if (rand.nextBoolean()) {
                shapes[i] = new Circle(x, y, c, rand.nextInt(50) + 20);
            } else {
                shapes[i] = new Rectangle(x, y, c, rand.nextInt(50) + 20, rand.nextInt(50) + 20);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
