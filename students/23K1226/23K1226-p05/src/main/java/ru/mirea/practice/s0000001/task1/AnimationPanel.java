package ru.mirea.practice.s0000001.task1;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Класс для анимации
class AnimationPanel extends JPanel {
    private Image[] frames;
    private int currentFrame = 0;

    public AnimationPanel(String[] imagePaths) {
        frames = new Image[imagePaths.length];
        for (int i = 0; i < imagePaths.length; i++) {
            frames[i] = Toolkit.getDefaultToolkit().getImage(imagePaths[i]);
        }
        Timer timer = new Timer(200, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                repaint();
            }
        });
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(frames[currentFrame], 0, 0, this);
    }
}
