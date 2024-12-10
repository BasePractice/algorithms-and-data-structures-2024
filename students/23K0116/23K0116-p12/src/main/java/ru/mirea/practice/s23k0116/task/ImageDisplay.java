package ru.mirea.practice.s23k0116.task;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.io.File;

public class ImageDisplay extends JFrame {

    public ImageDisplay(String imagePath) {
        // Настройка окна
        setTitle("Image Display");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Проверяем, существует ли файл по указанному пути
        File imageFile = new File(imagePath);
        if (!imageFile.exists()) {
            JOptionPane.showMessageDialog(null, "Image file not found");
            System.exit(1);
        }

        // Загрузка изображения
        ImageIcon imageIcon = new ImageIcon(imagePath);

        // Создаем JLabel для отображения изображения
        JLabel imageLabel = new JLabel(imageIcon);

        // Добавляем JLabel на основную панель окна и делаем его видимым
        add(imageLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Проверяем, передан ли путь к изображению в аргументах командной строки
        if (args.length != 1) {
            System.out.println("Укажите путь к изображению");
            System.exit(1);
        }

        // Получаем путь к изображению из аргументов командной строки
        String imagePath = args[0];

        // Создаем и отображаем окно с изображением
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageDisplay(imagePath);
            }
        });
    }
}
