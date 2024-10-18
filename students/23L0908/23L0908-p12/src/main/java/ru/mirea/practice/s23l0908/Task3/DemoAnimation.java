package ru.mirea.practice.s23l0908.Task3;

import java.awt.*;

public class DemoAnimation extends Canvas {
    Image img1;
    Image img2;
    Image img3;
    Image img4;
    Image img5;
    Image img6;
    Image img7;
    Image img8;

    // Constructor nhận 3 hình ảnh
    public DemoAnimation(Image img1, Image img2, Image img3, Image img4, Image img5, Image img6, Image img7, Image img8) {
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
    }

    public void paint(Graphics g) {
        if (img1 != null) {
            g.drawImage(img1, 400, 100, this);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img2, 400, 100, this);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img3, 400, 100, this);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img4, 400, 100, this);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img5, 400, 100, this);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img6, 400, 100, this);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img7, 400, 100, this);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img8, 400, 100, this);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    // Phương thức đặt lại hình ảnh
    public void setImage(Image img1, Image img2, Image img3, Image img4, Image img5, Image img6, Image img7, Image img8) {
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
    }
}
