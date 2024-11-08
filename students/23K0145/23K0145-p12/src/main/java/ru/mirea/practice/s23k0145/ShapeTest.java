package ru.mirea.practice.s23k0145;

public final class ShapeTest {

    private ShapeTest() {

    }

    public static void main(String[] args) {
        Shape circle = new Circle("Red", "(0,0)", 6.0);
        Shape rectangle = new Rectangle("Blue", "(1,1)", 5.0, 7.0);
        Shape triangle = new Triangle("Green", "(2,3)", 4.0, 5.0);

        System.out.printf("Circle area: %.2f%n", circle.area());
        System.out.printf("Circle perimeter: %.2f%n", circle.perimeter());

        System.out.printf("Rectangle area: %.2f%n", rectangle.area());
        System.out.printf("Rectangle perimeter: %.2f%n", rectangle.perimeter());

        System.out.printf("Triangle area: %.2f%n", triangle.area());
        System.out.printf("Triangle perimeter: %.2f%n", triangle.perimeter());
    }
}
