package ru.mirea.practice.s23k0120.task7.book;

import java.sql.Date;

public abstract class BookTest {
    public static void main(String[] args) {
        //Book book = new Book("А.С. Пушкин", "Евгений Онегин", new Date(1831, Calendar.OCTOBER, 5));

        Book[] books = new Book[6];
        for (int i = books.length - 1; i >= 0; i--) {
            books[books.length - i - 1] = new Book(Integer.toString(i), Integer.toString(i), new Date(1830 + i - 1900, i - 1, i));
        }

        Bookshelf bookshelf = new Bookshelf(books);

        //bookshelf.swap(3, 5);
        System.out.println(bookshelf);

        bookshelf.sort();
        System.out.println(bookshelf);

        System.out.printf("Oldest: %s \nNewest: %s", bookshelf.getOldest(), bookshelf.getNewest());
        //System.out.printf("Автор: %s Название: %s Дата: %s", book.getAuthor(), book.getName(), book.getDate().toString());
    }
}
