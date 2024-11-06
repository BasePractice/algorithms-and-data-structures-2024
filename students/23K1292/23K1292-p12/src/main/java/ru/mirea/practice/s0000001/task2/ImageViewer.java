package ru.mirea.practice.s0000001.task2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageViewer extends JFrame {
    private Image image;

    public ImageViewer(String imagePath) {
        super("Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось загрузить изображение: " + e.getMessage());
            System.exit(1);
        }

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (image != null) {
                    g.drawImage(image, 0, 0, this);
                }
            }
        };

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Укажите путь к изображению в качестве аргумента командной строки.");
            System.exit(1);
        }

        new ImageViewer(args[0]);
    }
}
