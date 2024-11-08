package ru.mirea.practice.s23k0135.task1;

import javax.swing.JFrame;

public abstract class ShapeDrawingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        ShapePanel panel = new ShapePanel(20);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}


