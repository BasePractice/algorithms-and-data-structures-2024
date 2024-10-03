package ru.mirea.practice.s23f0011.task2;

import javax.swing.JFrame;

public class ShapeFrame extends JFrame {

    public ShapeFrame() {
        super("Случайные фигуры");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        add(new ShapePanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new ShapeFrame();
    }
}

