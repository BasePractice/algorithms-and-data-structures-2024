package ru.mirea.practice.s23k0120.task7.book;

import java.util.Arrays;

public class Bookshelf {
    Book[] books;
    int size;
    public Bookshelf(Book[] books) {
        this.books = books.clone();
        this.size = this.books.length;
    }

    public void swap(int index1, int index2) {
        Book bookTemp;
        bookTemp = books[index1];
        books[index1] = books[index2];
        books[index2] = bookTemp;
    }

    public Book getOldest() {
        int indexOldest = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getDate().before(this.books[indexOldest].getDate())) {
                indexOldest = i;
            }
        }
        return this.books[indexOldest];
    }

    public Book getNewest() {
        int indexNewest = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getDate().after(this.books[indexNewest].getDate())) {
                indexNewest = i;
            }
        }
        return this.books[indexNewest];
    }

    public void sort() {
        int indexMin;
        for (int i = 0; i < books.length; i++) {
            indexMin = i;
            for (int j = i; j < books.length; j++) {
                if (books[indexMin].getDate().after(books[j].getDate())) {
                    indexMin = j;
                }
            }
            this.swap(i, indexMin);
        }
    }

    @Override
    public String toString() {
        return "Bookshelf: " +
                "\n" + Arrays.toString(books).replace("}, ", "}\n" ) +
                ", size=" + size +
                '}';
    }
}
