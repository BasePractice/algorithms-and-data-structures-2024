package ru.mirea.practice.s23k0690;

public final class TestBall {
    private TestBall() {
    }

    public static void main(String[] args) {
        Ball a = new Ball(0.0, 0.0);
        System.out.println("Ball " + a);
        System.out.println("getX " + a.getX());
        System.out.println("getY " + a.getY());
        a.setX(0.1);
        System.out.println("setX " + a.getX());
        a.setY(0.1);
        System.out.println("setY " + a.getY());
        a.setXY(0.2, 0.2);
        System.out.println("setXY " + a.getX() + " " + a.getY());
        a.move(0.1, 0.1);
        System.out.printf("move: %.2f %.2f", a.getX(), a.getY());
    }
}
