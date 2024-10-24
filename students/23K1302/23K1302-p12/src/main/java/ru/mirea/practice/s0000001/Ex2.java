package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Ex2 extends JFrame {

    public Ex2(String imagePath) {
        ImageIcon image = new ImageIcon(imagePath);
        if (image.getIconWidth() == -1) {
            System.out.println("Ошибка: изображение не загружено.");
        } else {
            JLabel label = new JLabel(image);
            add(label);
            setTitle("Image Display");
            setSize(image.getIconWidth(), image.getIconHeight());
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args) {
        String imagePath;
        if (args.length < 1) {
            System.out.println("No command-line argument provided. Using default image path.");
            imagePath = "resources/img.png"; // Здесь я написал "Заглушку" чтобы не нужно было писать путь в аргументах командной строки
        } else {
            imagePath = args[0];
        }
        // Но по каким-то одному только богу известным причинам программа не может открыть эту картинку
        SwingUtilities.invokeLater(() -> {
            Ex2 frame = new Ex2(imagePath);
            frame.setVisible(true);
        });
    }
}
