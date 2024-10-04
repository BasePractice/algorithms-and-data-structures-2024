package ru.mirea.practice.s0000001.task2;

class Ball {
    private double x, y;
    private double speedX, speedY;

    public Ball(double x, double y, double speedX, double speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public void move() {
        x += speedX;
        y += speedY;
    }

    public String toString() {
        return "Ball at (" + x + ", " + y + ")";
    }
}

class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0, 2, 3);
        System.out.println(ball);
        ball.move();
        System.out.println(ball);
    }
}