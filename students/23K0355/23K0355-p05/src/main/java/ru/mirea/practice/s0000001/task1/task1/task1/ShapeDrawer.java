package ru.mirea.practice.s0000001.task1.task1.task1;

import javax.swing.JFrame;

public final class ShapeDrawer {

    private ShapeDrawer() {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new ShapePanel());
        frame.setVisible(true);
    }
}