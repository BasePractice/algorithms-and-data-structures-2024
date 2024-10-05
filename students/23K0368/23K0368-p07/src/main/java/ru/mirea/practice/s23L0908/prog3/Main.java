package ru.mirea.practice.s23L0908.prog3;

public abstract class Main {
    public static void main(String[] args) {
        // Создаем круг с центром в (5, 5), радиусом 3 и начальной скоростью (1, 2)
        MovableCircle circle = new MovableCircle(5, 5, 1, 2, 3);

        System.out.println("Начальное положение:");
        System.out.println(circle.toCircleString());

        // Перемещаем круг вверх на 2 единицы
        circle.moveUp();
        circle.moveUp();

        System.out.println("\nПоложение после перемещения вверх:");
        System.out.println(circle.toCircleString());


        // Создаем прямоугольник с координатами вершин (1, 1) и (4, 4), скоростью (1, 2)
        MovableRectangle rectangle = new MovableRectangle(1, 1, 4, 4, 1, 2);

        // Выводим начальное положение прямоугольника
        System.out.println("\nНачальное положение:");
        System.out.println(rectangle.toRectangleString());

        // Перемещаем прямоугольник вправо на 3 единицы
        rectangle.moveRight();
        rectangle.moveRight();
        rectangle.moveRight();

        // Выводим новое положение прямоугольника
        System.out.println("\nПоложение после перемещения вправо:");
        System.out.println(rectangle.toRectangleString());

        // Проверяем, что у прямоугольника скорость одинаковая для всех точек
        if (rectangle.speedTest()) {
            System.out.println("Скорость прямоугольника одинаковая для всех точек.");
        } else {
            System.out.println("Скорость прямоугольника не одинаковая для всех точек.");
        }
    }
}
