package ru.mirea.practice.s230k754.lab11.task1;

import javax.swing.JFrame;

public final class Task1 {
    private Task1() {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new ShapeDrawer());
        frame.setVisible(true);
    }
}
