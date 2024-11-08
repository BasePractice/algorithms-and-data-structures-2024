package ru.mirea.practice.s0000001.task2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Image;

public class ImageViewer extends JFrame {

    private JLabel imageLabel;

    public ImageViewer(String imagePath) {
        setTitle("Image Viewer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        loadImage(imagePath);

        add(imageLabel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void loadImage(String imagePath) {
        try {
            ImageIcon imageIcon = new ImageIcon(imagePath);
            Image image = imageIcon.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(image));
        } catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
            imageLabel.setText("Image not found or could not be loaded.");
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java ImageViewer <image_path>");
            System.exit(1);
        }

        new ImageViewer(args[0]);
    }
}
