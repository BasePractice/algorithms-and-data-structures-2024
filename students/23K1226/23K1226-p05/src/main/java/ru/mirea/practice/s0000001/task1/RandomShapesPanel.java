package ru.mirea.practice.s0000001.task1;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class RandomShapesPanel extends JPanel {
    private Shape[] shapes;

    public RandomShapesPanel() {
        shapes = new Shape[20];
        Random rand = new Random();
        for (int i = 0; i < shapes.length; i++) {
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int x = rand.nextInt(300);
            int y = rand.nextInt(300);
            if (rand.nextBoolean()) {
                shapes[i] = new Circle(color, x, y, 30);
            } else {
                shapes[i] = new Rectangle(color, x, y, 60, 30);
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
