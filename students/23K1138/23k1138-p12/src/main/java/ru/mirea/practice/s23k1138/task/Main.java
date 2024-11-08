package ru.mirea.practice.s23k1138.task;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        Square square = new Square(2.0, 1.0, "green");
        Circle circle = new Circle(2.0, 1.0, "yellow");
        System.out.println(square);
        System.out.println(circle);
    }
}