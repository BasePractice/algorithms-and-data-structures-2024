package ru.mirea.practice.s23k0112;

public final class Test {
    private Test() {

    }

    public static void main(String[] args) {
        Circle circle = new Circle("circle", "red", true, 5);
        System.out.println(circle.toString());
        circle.setRadius(10);
        System.out.println(circle.toString());

        Square square = new Square("square", "blue", false, 6);
        System.out.println(square.toString());
        square.setColor("cyan");
        System.out.println(square.toString());

        Rectangle rectangle = new Rectangle("rectangle", "green", true, 4, 9);
        System.out.println(rectangle.toString());
    }
}
