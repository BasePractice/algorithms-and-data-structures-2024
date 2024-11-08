package ru.mirea.practice.s23k0215.task1;

import javax.swing.JFrame;

public final class Main {
    // Private constructor to prevent instantiation
    private Main() {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        ShapeCanvas canvas = new ShapeCanvas();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(canvas);
        frame.setVisible(true);
    }
}
