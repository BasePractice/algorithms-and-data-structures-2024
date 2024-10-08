package ru.mirea.practice.s23K0135;

import javax.swing.JFrame;

public abstract class Task2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        Drawing drawingPanel = new Drawing();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(drawingPanel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
