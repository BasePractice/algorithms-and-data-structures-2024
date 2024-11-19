package ru.mirea.practices0000001.task3;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.BorderLayout;

public abstract class ImageAnimator {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\sib-e\\IdeaProjects\\MIREA_LABS\\image2"; // Если надо напишите пришлю папочку))
        File folder = new File(folderPath);

        if (!folder.isDirectory()) {
            System.err.println("Ошибка: указанный путь не является каталогом");
            System.exit(1);
        }

        File[] files = folder.listFiles();
        if (files == null) {
            System.err.println("Ошибка: не удается отобразить список файлов в указанном каталоге");
            System.exit(1);
        }

        List<BufferedImage> frames = new ArrayList<>();

        for (File file : files) {
            if (file.isFile() && file.getName().startsWith("frame_") && file.getName().endsWith(".gif")) {
                try {
                    BufferedImage image = ImageIO.read(file);
                    frames.add(image);
                } catch (IOException e) {
                    System.err.println("Ошибка при чтении изображения: " + e.getMessage());
                }
            }
        }

        if (frames.isEmpty()) {
            System.err.println("Ошибка: в указанном каталоге не найдено изображений");
            System.exit(1);
        }

        JFrame frame = new JFrame("Аниамация набора изображений");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frames.get(0).getWidth(), frames.get(0).getHeight());

        JLabel label = new JLabel();
        label.setSize(frames.get(0).getWidth(), frames.get(0).getHeight());

        Timer timer = new Timer(30, new ActionListener() {
            int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setIcon(new ImageIcon(frames.get(index)));
                index = (index + 1) % frames.size();
            }
        });

        frame.getContentPane().add(label, BorderLayout.CENTER);
        timer.start();

        frame.setVisible(true);
    }
}
