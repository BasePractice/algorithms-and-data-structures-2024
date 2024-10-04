package ru.mirea.practice.s0000001.task3;

import javax.swing.*;
import java.awt.*;

public class ImageDisplay extends JPanel {
    private Image image;

    public ImageDisplay(String imagePath) {
        image = Toolkit.getDefaultToolkit().getImage(imagePath);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            JFrame frame = new JFrame("Image Display");
            ImageDisplay panel = new ImageDisplay(args[0]);
            frame.add(panel);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } else {
            System.out.println("Please provide an image path as a command line argument.");
        }
    }
}
