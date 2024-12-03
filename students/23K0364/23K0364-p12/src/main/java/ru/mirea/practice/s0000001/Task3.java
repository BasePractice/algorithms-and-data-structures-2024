package ru.mirea.practice.s0000001;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

public class Task3 extends JPanel {
    private Image[] frames;  // Массив для хранения кадров
    private int currentFrame = 0;  // Индекс текущего кадра

    public Task3(String[] framePaths) {
        frames = new Image[framePaths.length];

        // Загружаем все кадры
        for (int i = 0; i < framePaths.length; i++) {
            frames[i] = new ImageIcon(framePaths[i]).getImage();
        }

        // Используем таймер для обновления кадров
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                currentFrame = (currentFrame + 1) % frames.length;  // Переходим к следующему кадру
                repaint();  // Перерисовываем панель
            }
        }, 0, 200);  // Интервал обновления: 200 миллисекунд
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(frames[currentFrame], 0, 0, this);  // Рисуем текущий кадр
    }

    public static void main(String[] args) {
        // Пути к изображением кадров анимации
        String[] framePaths = {"frame1.png", "frame2.png", "frame3.png", "frame4.png"
        };

        JFrame frame = new JFrame("Image Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        Task3 animationPanel = new Task3(framePaths);
        frame.add(animationPanel);
        frame.setVisible(true);
    }
}
