package ru.mirea.practice.s23k0130.task;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        Square square = new Square(1.0, 2.0, "red");
        Square triangle = new Square(1.0, 2.0, "blue");
        System.out.println(square);
        System.out.println(triangle);
    }
}