package ru.mirea.practice.s23l0908.Task4;

import javax.swing.*;
import java.awt.*;

class BorderExample extends JFrame {
    JPanel[] pnl = new JPanel[12];

    public BorderExample() {
        setLayout(new GridLayout(3, 4));
        for (int i = 0; i < pnl.length; i++) {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
        }
    }
}
