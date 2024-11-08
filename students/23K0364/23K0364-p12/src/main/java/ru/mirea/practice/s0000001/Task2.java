package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.MediaTracker;
import java.io.File;

public abstract class Task2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите путь к изображению в аргументах командной строки.");
            return;
        }

        String imagePath = args[0];
        File imageFile = new File(imagePath);

        // Проверка существования файла
        if (!imageFile.exists()) {
            System.out.println("Файл не найден по указанному пути: " + imagePath);
            return;
        }

        ImageIcon imageIcon = new ImageIcon(imagePath);

        // Проверка на пустое изображение
        if (imageIcon.getImageLoadStatus() != MediaTracker.COMPLETE) {
            System.out.println("Не удалось загрузить изображение.");
            return;
        }

        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Автоматическая подгонка окна под размер изображения
        frame.setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());

        JLabel imageLabel = new JLabel(imageIcon);
        frame.add(imageLabel);
        frame.setVisible(true);
    }
}

