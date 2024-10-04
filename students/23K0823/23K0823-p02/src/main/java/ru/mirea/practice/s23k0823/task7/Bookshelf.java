package ru.mirea.practice.s23k0823.task7;

import java.util.Arrays;

public class Bookshelf {
    private Book[] books;
    private int numBooks;

    public Bookshelf(int capacity) {
        this.books = new Book[capacity];
        this.numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Шкаф полон");
        }
    }

    public Book getLatestBook() {
        Book latestBook = books[0];
        for (int i = 1; i < numBooks; i++) {
            if (books[i].getPublicationYear() > latestBook.getPublicationYear()) {
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public Book getEarliestBook() {
        Book earliestBook = books[0];
        for (int i = 1; i < numBooks; i++) {
            if (books[i].getPublicationYear() < earliestBook.getPublicationYear()) {
                earliestBook = books[i];
            }
        }
        return earliestBook;
    }

    public void sortBooksByPublicationYear() {
        Arrays.sort(books, 0, numBooks, (book1, book2) -> book1.getPublicationYear() - book2.getPublicationYear());
    }

    public void printBooks() {
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i].toString());
        }
    }

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(5);

        Book book1 = new Book("Рей Бредбери", "451 по фаренгейту", 1953);
        Book book2 = new Book("Рей Бредбери", "Вино из одуванчиков", 1957);
        Book book3 = new Book("Айзек Азимов", "Я робот", 1950);

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        System.out.println("Последняя книга: " + bookshelf.getLatestBook().toString());
        System.out.println("Самая ранняя книга: " + bookshelf.getEarliestBook().toString());

        bookshelf.sortBooksByPublicationYear();
        System.out.println("Книги отсортированы по году издания: ");
        bookshelf.printBooks();
    }
}