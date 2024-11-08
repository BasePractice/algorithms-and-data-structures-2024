package ru.mirea.practice.s23k0164.t1;

public final class MainShapes {

    private MainShapes() {
    }

    public static void main(String[] args) {
        Square square = new Square(1.0, 2.0, "red");
        Square circle = new Square(1.0, 2.0, "blue");
        System.out.println(square);
        System.out.println(circle);
    }
}
