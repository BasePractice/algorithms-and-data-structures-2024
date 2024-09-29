package ru.mirea.practice.s230k754.lab5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public final class Task2  {
    private Task2() {}
    private static final Random r = new Random();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        frame.getContentPane().add(new FigureDraw(20));

        frame.pack();
        frame.setVisible(true);

    }
}
