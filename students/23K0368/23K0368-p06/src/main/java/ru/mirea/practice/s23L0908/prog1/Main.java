package ru.mirea.practice.s23L0908.prog1;

public abstract class Main {

    public static void main(String[] args) {
        // Создаем окружность с центром в (5, 5), радиусом 3 и начальной скоростью (1, 2), скорость перемещения отвечает
        // за скорость изменения положения центра окружности
        MovableCircle circle = new MovableCircle(5, 5, 1, 2, 3);

        // Выводим начальное положение окружности
        System.out.println("Начальное положение:");
        System.out.println(circle);

        // Перемещаем окружность вверх на 2 единицы
        circle.moveUp();

        // Выводим новое положение окружности
        System.out.println("\nПоложение после перемещения вверх:");
        System.out.println(circle);

        // Перемещаем окружность вправо на 3 единицы
        circle.moveRight();

        // Выводим новое положение окружности
        System.out.println("\nПоложение после перемещения вправо:");
        System.out.println(circle);
    }
}
