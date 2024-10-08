package ru.mirea.practice.s23K0135;

public class Test3 {
    private Circle[] circles;
    private int count;

    // Конструктор
    public Test3(int size) {
        circles = new Circle[size];
        count = 0;
    }

    // Метод для добавления окружности
    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив полон!");
        }
    }

    // Метод для вывода всех окружностей
    public void displayCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

}
