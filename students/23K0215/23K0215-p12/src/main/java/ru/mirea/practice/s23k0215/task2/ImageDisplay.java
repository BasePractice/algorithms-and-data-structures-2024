package ru.mirea.practice.s23k0215.task2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Image;

public final class ImageDisplay {
    // Приватный конструктор для предотвращения создания экземпляров
    private ImageDisplay() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            return;
        }

        String imagePath = args[0];
        File imageFile = new File(imagePath);

        JFrame frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        try {
            Image image = ImageIO.read(imageFile);
            JLabel label = new JLabel(new ImageIcon(image));
            frame.getContentPane().add(label, BorderLayout.CENTER);
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке изображения: " + e.getMessage());
            return;
        }

        frame.setVisible(true);
    }
}
