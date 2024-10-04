package ru.mirea.practice.s0000001.task1;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(0, 0, 5);
        MovablePoint bottomRight = new MovablePoint(10, 10, 5);
        MovableRectangle rectangle = new MovableRectangle(topLeft, bottomRight);

        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);

        MathCalculable mc = new MathFunc();
        System.out.println("Power: " + mc.power(2, 3));
        System.out.println("Modulus: " + mc.modulus(3, 4));

        ProcessStrings ps = new ProcessStrings();
        String testString = "Hello, World!";
        System.out.println("Count of chars: " + ps.countChars(testString));
        System.out.println("Odd position chars: " + ps.oddPositionChars(testString));
        System.out.println("Reversed string: " + ps.reverseString(testString));

        Printable[] printables = { new Book("Effective Java"), new Magazine("Java Magazine") };
        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}
