package ru.mirea.practice.s23k0690;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;

public final class Task2 {
    private Task2() {}

    public static void main(String[] args) {
        displayImage();
    }

    private static void displayImage() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите полный путь к изображению: ");
            String imagePath = in.nextLine();
            JFrame frame = new JFrame("Показываем картинку");
            ImageIcon icon = new ImageIcon(imagePath);
            if (icon.getIconWidth() == -1) {
                System.out.println("Ошибка: изображение не найдено по пути: " + imagePath);
                return;
            }
            JPanel panel = new JPanel();
            panel.add(new JLabel(icon));
            frame.add(panel);
            frame.setSize(new Dimension(700, 500));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }
}