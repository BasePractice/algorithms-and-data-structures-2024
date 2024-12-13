package ru.mirea.practice.s0000001.num2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите путь к папке с изображениями.");
            return;
        }

        File dir = new File(args[0]);
        File[] files = dir.listFiles((d, name) -> name.endsWith(".png"));
        if (files == null || files.length == 0) {
            System.out.println("Нет изображений в указанной папке.");
            return;
        }

        try {
            Image[] frames = new Image[files.length];
            for (int i = 0; i < files.length; i++) {
                frames[i] = ImageIO.read(files[i]);
            }

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 600);
            frame.setVisible(true);

            new javax.swing.Timer(100, e -> {
                frame.getContentPane().removeAll();
                frame.add(new JPanel() {
                    int index = 0;
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.drawImage(frames[index], 0, 0, this);
                        index = (index + 1) % frames.length;
                    }
                });
                frame.revalidate();
                frame.repaint();
            }).start();
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке изображений.");
            e.printStackTrace();
        }
    }
}
