package ru.mirea.practice.s0000001;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

public abstract class Task1 {
    public static void main(String[] args) {
        //String p1 = args[0];
        String p1 = "students/23K0688/23K0688-p12/src/main/java/ru/mirea/practice/s0000001/broj1.jpg";
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
