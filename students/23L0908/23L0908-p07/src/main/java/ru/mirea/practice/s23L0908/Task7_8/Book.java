package ru.mirea.practice.s23L0908.Task7_8;

public class Book {
    public static void printBook(Printable[] printables) {
        for (int i = 0; i < printables.length; i++)
            if (printables[i] instanceof Printable)
                System.out.println(printables[i].getName());
    }
}
