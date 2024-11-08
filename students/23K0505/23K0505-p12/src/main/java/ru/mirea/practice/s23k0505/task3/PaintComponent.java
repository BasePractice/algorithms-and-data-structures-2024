package ru.mirea.practice.s23k0505.task3;

import javax.swing.Timer;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;

public class PaintComponent extends Component {
    private final Image image;
    private final int frameNum;
    private final ImageObserver imageObserver;
    private int sx1;
    private int sx2;
    private int sy1;
    private int sy2;
    private int width;
    private int height;

    public PaintComponent(Image image, int x1, int y1, int x2, int y2, int frameNum, ImageObserver imageObserver) {
        this.image = image;
        this.sx1 = x1;
        this.sx2 = x2;
        this.sy1 = y1;
        this.sy2 = y2;
        this.height = sy2 - sy1;
        this.width = sx2 - sx1;
        this.frameNum = frameNum;
        this.imageObserver = imageObserver;
        initTimer();
    }

    private void initTimer() {
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sy1 = (sy1 + height) % (height * frameNum);
                sy2 = (sy2 + height) % (height * frameNum);

                if (sy2 == 0) {
                    sy1 = 0;
                    sy2 = height;
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, width, height, sx1, sy1, sx2, sy2, imageObserver);
    }
}
