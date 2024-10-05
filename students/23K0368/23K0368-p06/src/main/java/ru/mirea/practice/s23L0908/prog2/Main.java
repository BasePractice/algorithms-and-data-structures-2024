package ru.mirea.practice.s23L0908.prog2;

public abstract class Main {
    public static void main(String[] args) {
        //Создаем прямоугольник
        MovableRectangle firstRectangle = new MovableRectangle(1, 1, 5, 5, 1, 1);

        System.out.println("Начальное положение:");
        System.out.println(firstRectangle);

        // Перемещаем окружность вверх на 2 единицы
        firstRectangle.moveUp();

        // Выводим новое положение окружности
        System.out.println("\nПоложение после перемещения вверх:");
        System.out.println(firstRectangle);

        // Перемещаем окружность вправо на 3 единицы
        firstRectangle.moveRight();

        // Выводим новое положение окружности
        System.out.println("\nПоложение после перемещения вправо:");
        System.out.println(firstRectangle);
    }
}
