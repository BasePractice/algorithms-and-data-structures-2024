package ru.mirea.practice.s23L0908;

/**
 * Напишите два класса MovablePoint и MovableCircle - которые
 * реализуют интерфейс Movable (см img.png)
 */

public abstract class Task1 {
    public static void main(String[] args) {
        System.out.println("No testing! Only implementation.");
    }


    interface Movable {
        void moveUp();

        void moveDown();

        void moveLeft();

        void moveRight();
    }

    static class Point implements Movable {
        double x;
        double y;
        double speed;

        Point() {
            x = 0.0;
            y = 0.0;
            speed = 1.0;
        }

        Point(double x, double y, double speed) {
            this.x = x;
            this.y = y;
            this.speed = speed;
        }

        @Override
        public void moveUp() {
            this.y += speed;
        }

        @Override
        public void moveDown() {
            this.y -= speed;
        }

        @Override
        public void moveLeft() {
            this.x -= speed;
        }

        @Override
        public void moveRight() {
            this.x += speed;
        }
    }

    static class Circle implements Movable {
        double cx;
        double cy;
        double r;
        double speed;

        Circle() {
            this(0.0, 0.0, 0.0, 1.0);
        }

        Circle(double cx, double cy, double r, double speed) {
            this.cx = cx;
            this.cy = cy;
            this.r = r;
            this.speed = speed;
        }

        @Override
        public void moveUp() {
            cy += speed;
        }

        @Override
        public void moveDown() {
            cy -= speed;
        }

        @Override
        public void moveLeft() {
            cx -= speed;
        }

        @Override
        public void moveRight() {
            cx += speed;
        }
    }
}
