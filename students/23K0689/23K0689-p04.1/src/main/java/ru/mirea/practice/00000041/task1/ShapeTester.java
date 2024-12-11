package ru.mirea.practice.s0000001.task1;

public final class ShapeTester {

    private ShapeTester() {

    }

    public static void main(String[] args) {
        // Создаем объекты фигур
        Shape circle = new Circle(5);          // Радиус круга = 5
        Shape rectangle = new Rectangle(4, 6); // Длина = 4, Ширина = 6
        Shape square = new Square(4);          // Сторона квадрата = 4

        // Вызываем методы через родительскую ссылку
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        // Демонстрация вызова методов
        System.out.println("Тип фигуры: " + circle.getType() + ", Площадь: " + circle.getArea() + ", Периметр: " + circle.getPerimeter());
        System.out.println("Тип фигуры: " + rectangle.getType() + ", Площадь: " + rectangle.getArea() + ", Периметр: " + rectangle.getPerimeter());
        System.out.println("Тип фигуры: " + square.getType() + ", Площадь: " + square.getArea() + ", Периметр: " + square.getPerimeter());
    }
}