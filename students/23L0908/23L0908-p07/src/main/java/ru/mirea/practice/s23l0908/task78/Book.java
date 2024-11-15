package ru.mirea.practice.s23l0908.task78;

public final class Book {

    private Book() {
    }

    public static void printBook(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable != null) {
                System.out.println(printable.getName());
            }
        }
    }
}

