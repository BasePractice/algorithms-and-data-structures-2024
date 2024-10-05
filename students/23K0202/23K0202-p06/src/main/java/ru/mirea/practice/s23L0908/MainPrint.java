package ru.mirea.practice.s23L0908;

public abstract class MainPrint {
    public static void main(String[] args) {
        Printable[] printables = {new Book("Онегин", "А.С. Пушкин"), new Shop("Канцтовары"),
            new Book("Война и мир", "Л.Н. Толстой"), new Shop("Книжная лавка")};

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
