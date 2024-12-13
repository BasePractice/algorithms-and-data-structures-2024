package ru.mirea.practice.s0000001.num1;

import javax.swing.JFrame;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(new RandomShapesPanel());
        frame.setVisible(true);
    }
}
