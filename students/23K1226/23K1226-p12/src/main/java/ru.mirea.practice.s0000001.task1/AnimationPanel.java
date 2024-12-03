package ru.mirea.practice.s0000001.task1;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationPanel extends JPanel {
    private Image[] frames;
    private int currentFrame = 0;

    public AnimationPanel(String[] framePaths) {
        frames = new Image[framePaths.length];
        try {
            for (int i = 0; i < framePaths.length; i++) {
                frames[i] = ImageIO.read(new File(framePaths[i]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (frames.length > 0) {
            g.drawImage(frames[currentFrame], 0, 0, this);
        }
    }
}
