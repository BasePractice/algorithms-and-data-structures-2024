package ru.mirea.practice.s0000001.task1;

public class Square extends Rectangle {

    // Конструктор, который вызывает конструктор родительского класса с двумя параметрами
    public Square(double side) {
        super(side, side);  // Для квадрата длина и ширина равны, поэтому передаем 'side' дважды
    }

    @Override
    public String getType() {
        return "Квадрат";
    }

    @Override
    public String toString() {
        return "Тип фигуры: " + getType() + ", Сторона: " + super.getArea() / super.getPerimeter() * 2
                + ", Площадь: " + getArea() + ", Периметр: " + getPerimeter();
    }
}