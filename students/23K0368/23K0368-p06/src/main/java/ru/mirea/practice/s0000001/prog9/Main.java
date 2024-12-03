package ru.mirea.practice.s0000001.prog9;

public abstract class Main {
    public static void main(String[] args) {
        Printable[] book = new Book[3];
        book[0] = new Book("Life1", "ivan");
        book[1] = new Book("Life2", "oleg");
        book[2] = new Book("Life3", "vadim");

        for (Printable printable : book) {
            printable.print();
        }

    }
}
