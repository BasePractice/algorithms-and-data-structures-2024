package ru.mirea.practice.lab5.shape;

import javax.swing.JFrame;

public class ShapeWindow extends JFrame {
    public ShapeWindow() {
        setTitle("Random Shapes");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new ShapePanel());
        setVisible(true);
    }
}
