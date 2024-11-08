package ru.mirea.practice.s23k0215;

public final class TestBall {
    private TestBall() {
    }

    public static void main(String[] args) {
        // Создаем объект класса Ball
        Ball ball = new Ball(0, 0);

        // Тестируем геттеры
        System.out.println("Initial position: " + ball.toString());

        // Перемещаем мяч
        ball.move(5, 10);
        System.out.println("After moving: " + ball.toString());

        // Изменяем положение через сеттеры
        ball.setX(2);
        ball.setY(3);
        System.out.println("Updated position: " + ball.toString());
    }
}