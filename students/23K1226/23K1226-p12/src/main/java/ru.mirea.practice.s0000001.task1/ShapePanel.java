package ru.mirea.practice.s0000001.task1;

import javax.swing.JPanel;
import java.awt.Graphics;

public class ShapePanel extends JPanel {
    private Shape[] shapes;

    public ShapePanel() {
        shapes = new Shape[20];
        for (int i = 0; i < shapes.length; i++) {
            if (Math.random() < 0.5) {
                shapes[i] = new Circle();
            } else {
                shapes[i] = new Rectangle();
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
