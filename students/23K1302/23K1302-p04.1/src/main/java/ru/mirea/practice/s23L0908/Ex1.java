package ru.mirea.practice.s23L0908;

public final class Ex1 {

    private Ex1() {
        // Пустота
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(4.0);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
