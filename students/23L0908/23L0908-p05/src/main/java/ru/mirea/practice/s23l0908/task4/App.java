package ru.mirea.practice.s23l0908.task4;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class App implements Runnable {
    private final ImageIcon[] frames;
    private final JLabel display;
    private int current;

    App() {
        current = 0;
        frames = new ImageIcon[]{
            new ImageIcon("files/meo.webp"),
            new ImageIcon("files/cat.jpg")
        };
        display = new JLabel();
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(display, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            display.setIcon(frames[current++]);
            if (current == frames.length) {
                current = 0;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}
