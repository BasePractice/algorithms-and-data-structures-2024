package ru.mirea.practice.s26k0112;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;


public final class ImageDisplay {
    private ImageDisplay() {

    }

    public static void main(String[] args) {
        String imagePath = "/Users/martin/IdeaProjects/algorithms-and-data-structures-2024/students/23K0112/sin.png";

        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            System.err.println("Error loading image: " + e.getMessage());
            return;
        }

        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}