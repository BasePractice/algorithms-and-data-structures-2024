package ru.mirea.practice.s23k0375.task2;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

public abstract class ImageDisplay {
    public static void main(String[] args) {
        String p1 = "students/23K0375/23K0375-p12/src/main/java/ru/mirea/practice/s23k0375/task2/img.png";
        final ImageIcon pic1 = new ImageIcon(p1);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(700, 700);
        JLabel lab = new JLabel();
        frame.setVisible(true);
        frame.add(lab);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab.setIcon(pic1);
    }
}
