package ru.mirea.practice.s0000001.task1;

import javax.swing.JPanel;
import java.awt.Graphics;

// Класс DrawingPanel, который будет рисовать фигуры
class DrawingPanel extends JPanel {
    private Shape[] shapes;

    public DrawingPanel(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
