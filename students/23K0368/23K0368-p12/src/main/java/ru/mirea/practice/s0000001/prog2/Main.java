package ru.mirea.practice.s0000001.prog2;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.awt.Image;

public class Main extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 600;

    public Main(String imagePath) {
        setTitle("Изображение");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Загрузка изображения
        ImageIcon icon = new ImageIcon(imagePath);

        // Масштабирование изображения (так как оно не влезает)
        Image scaledImage = icon.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Создание JLabel для отображения изображения
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setHorizontalTextPosition(JLabel.CENTER); // Центрирование изображения
        imageLabel.setVerticalTextPosition(JLabel.CENTER);
        imageLabel.setIconTextGap(0);
        // Установка масштабирования изображения в JLabel
        imageLabel.setIcon(scaledIcon);
        add(imageLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Необходимо указать путь к изображению в качестве аргумента командной строки.");
            return;
        }

        String imagePath = args[0];

        SwingUtilities.invokeLater(() -> new Main(imagePath));
    }
}
