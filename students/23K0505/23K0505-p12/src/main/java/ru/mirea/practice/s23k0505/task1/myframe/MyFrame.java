package ru.mirea.practice.s23k0505.task1.myframe;

//import javax.swing.*;
//import java.awt.*;

import javax.swing.JFrame;
import java.awt.Dimension;

public class MyFrame {
    JFrame frame;

    public MyFrame(int width, int height) {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(width, height));

        frame.setResizable(false);
        frame.add(new PaintComponent(frame.getPreferredSize()));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
