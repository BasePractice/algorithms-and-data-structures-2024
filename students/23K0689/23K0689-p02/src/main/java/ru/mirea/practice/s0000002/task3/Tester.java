package ru.mirea.practice.s0000002.task3;

// Класс для тестирования и хранения объектов Circle
public class Tester {
    private Circle[] circles; // Массив окружностей
    private int circleCount;  // Количество окружностей в массиве

    // Конструктор
    public Tester(int size) {
        circles = new Circle[size]; // Инициализация массива
        circleCount = 0; // Начальное количество окружностей
    }

    // Метод для добавления окружности
    public void addCircle(Circle circle) {
        if (circleCount < circles.length) {
            circles[circleCount] = circle; // Добавляем окружность в массив
            circleCount++; // Увеличиваем счетчик
        } else {
            System.out.println("Массив заполнен, не удалось добавить окружность.");
        }
    }

    // Метод для вывода всех окружностей
    public void printCircles() {
        for (int i = 0; i < circleCount; i++) {
            System.out.println(circles[i]); // Выводим информацию об окружностях
        }
    }
}