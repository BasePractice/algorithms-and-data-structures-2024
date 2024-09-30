package ru.mirea.practice.s230k754.lab5.task3;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public final class Task3 {
    private Task3() {}

    public static void main(String[] args) {
        var url = "C:\\Users\\a_naz\\IdeaProjects\\argo\\students\\23K0754\\23K0754-p01\\"
                + "src\\main\\java\\ru\\mirea\\practice\\s230k754\\lab5\\task3\\img.png";
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
