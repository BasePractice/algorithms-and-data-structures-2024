package ru.mirea.practice.s230k754.lab11.task2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public final class Task2 {
    private Task2() {}

    public static void main(String[] args) {
        var url = "C:\\Users\\a_naz\\IdeaProjects\\argo\\students\\23K0754\\23K0754-p012"
            + "\\src\\main\\java\\ru\\mirea\\practice\\s230k754\\lab11\\task2\\img.png";
        JFrame frame = new JFrame("Task1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        ImageIcon imageIcon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(imageIcon);
        frame.getContentPane().add(imageLabel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
