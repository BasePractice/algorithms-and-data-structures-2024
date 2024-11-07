package ru.mirea.practice.s0000002.task3;

// Класс для тестирования
public abstract class TestCircle {
    public static void main(String[] args) {
        // Создание нескольких окружностей
        Point pointA = new Point(1.0, 2.0);
        Circle circleA = new Circle(pointA, 5.0);

        Point pointB = new Point(3.0, 4.0);
        Circle circleB = new Circle(pointB, 7.0);

        // Тестирование класса Tester
        Tester tester = new Tester(5); // Создаем Tester с массивом на 5 окружностей
        tester.addCircle(circleA); // Добавляем первую окружность
        tester.addCircle(circleB); // Добавляем вторую окружность

        // Вывод информации об окружностях
        tester.printCircles();
    }
}