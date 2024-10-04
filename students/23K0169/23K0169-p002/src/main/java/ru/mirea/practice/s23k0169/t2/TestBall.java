package ru.mirea.practice.s23k0169.t2;

public final class TestBall {

    private TestBall() {

    }

    public static void main(String[] args) {
        Ball ball1 = new Ball(1.5, 4.7);
        System.out.println(ball1.getX());
        System.out.println(ball1.getY());

        ball1.move(3.0, 6.1);
        System.out.println("Шар 1 после перемещения: " + ball1);

        ball1.setXY(8.2, 7.6);
        System.out.println("Шар 1 после установки новых координат: " + ball1);
    }
}
