package ru.mirea.practice.s0000001.prog3;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JFrame;

public class Main extends JPanel implements ActionListener {
    private BufferedImage[] frames;
    private int currentFrame = 0;

    public Main(String[] imagePaths, int delay) {
        frames = new BufferedImage[imagePaths.length];
        loadFrames(imagePaths);
        Timer timer = new Timer(delay, this);
        timer.start();
    }

    private void loadFrames(String[] imagePaths) {
        try {
            for (int i = 0; i < imagePaths.length; i++) {
                frames[i] = ImageIO.read(new File(imagePaths[i]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (frames != null && frames.length > 0) {
            g.drawImage(frames[currentFrame], 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentFrame = (currentFrame + 1) % frames.length;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Photo Animation Example");

        // Укажите пути к вашим изображениям
        String[] imagePaths = {
            "/Users/andrejskrypov/Desktop/РТУ МИРЭА/3 семестр/Java/Praktika12/src/prog3/IMG_1159.jpeg",
            "/Users/andrejskrypov/Desktop/РТУ МИРЭА/3 семестр/Java/Praktika12/src/prog3/IMG_1189.jpeg",
            "/Users/andrejskrypov/Desktop/РТУ МИРЭА/3 семестр/Java/Praktika12/src/prog3/IMG_1159.jpeg",
            "/Users/andrejskrypov/Desktop/РТУ МИРЭА/3 семестр/Java/Praktika12/src/prog3/IMG_7231.jpeg"
        };

        Main animationPanel = new Main(imagePaths, 1000); // Задержка 1000 мс (1 секунда)

        frame.add(animationPanel);
        frame.setSize(800, 600);  // Установите размер окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

