package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageDisplayWindow extends JFrame {

    private Image image;

    public ImageDisplayWindow(String imagePath) {
        try {
            File imageFile = new File(imagePath);
            image = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке изображения: " + e.getMessage());
        }

        setTitle("Image Display");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        } else {
            g.drawString("Изображение не загружено!", 100, 100);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Не указан путь к изображению.");
            return;
        }

        String imagePath = args[0];
        ImageDisplayWindow window = new ImageDisplayWindow(imagePath);
        window.setVisible(true);
    }
}
