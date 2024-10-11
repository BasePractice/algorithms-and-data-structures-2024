package ru.mirea.practice.s0000001.task1.task1.task2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;

public class DisplayImage extends JPanel {
    private Image image;

    public DisplayImage(String imagePath) {
        image = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java DisplayImage <image-path>");
            System.exit(1);
        }

        String imagePath = args[0];
        JFrame frame = new JFrame("Display Image");
        DisplayImage panel = new DisplayImage(imagePath);
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}