package ru.mirea.practice.s24k0112.task6;

import ru.mirea.practice.s25k0112.task6.Book;
import ru.mirea.practice.s25k0112.task6.Printable;

public final class Test {
    private Test() {

    }

    public static void main(String[] args) {
        ru.mirea.practice.s25k0112.task6.Printable[] books = {new ru.mirea.practice.s25k0112.task6.Book("Lord of Rings", "Tolkien"), new Book("War and peace", "Tolstoi")};
        for (Printable book : books) {
            book.print();
        }
    }
}
