package ru.mirea.practice.s0000001.task2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;

public abstract class ImageDisplayApp {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            return;
        }

        String imagePath = args[0];

        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();

        Image scaledImage = image.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(scaledImage);

        JLabel label = new JLabel(imageIcon);
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }
}

