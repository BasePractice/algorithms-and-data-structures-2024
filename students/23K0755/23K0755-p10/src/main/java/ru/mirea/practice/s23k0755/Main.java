package ru.mirea.practice.s23k0755;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public abstract class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 450);

        JPanel panel = new JPanel();
        ImageIcon image;
        try {
            image = new ImageIcon(args[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(image);

        panel.add(new JLabel(image));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
