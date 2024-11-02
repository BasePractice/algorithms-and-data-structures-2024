package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;

public class Ex2 extends JFrame {

    public Ex2(URL imagePath) {
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

    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        URL imagePath;
        if (args.length < 1) {
            System.out.println("No command-line argument provided. Using default image path.");
            imagePath = Objects.requireNonNull(Ex2.class.getResource("/img.png")).toURI().toURL();
            // Здесь я написал "Заглушку" чтобы не нужно было писать путь в аргументах командной строки
        } else {
            imagePath = new URL("file://" + args[0]);
        }

        SwingUtilities.invokeLater(() -> {
            Ex2 frame = new Ex2(imagePath);
            frame.setVisible(true);
        });
    }
}
