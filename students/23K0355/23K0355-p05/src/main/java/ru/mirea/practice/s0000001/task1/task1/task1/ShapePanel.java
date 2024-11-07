package ru.mirea.practice.s0000001.task1.task1.task1;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class ShapePanel extends JPanel {
    private Shape[] shapes;

    public ShapePanel() {
        shapes = new Shape[20];
        Random rand = new Random();

        for (int i = 0; i < shapes.length; i++) {
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int x = rand.nextInt(400);
            int y = rand.nextInt(400);

            if (rand.nextBoolean()) {
                int radius = rand.nextInt(50) + 10;
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = rand.nextInt(100) + 20;
                int height = rand.nextInt(100) + 20;
                shapes[i] = new Rectangle(color, x, y, width, height);
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