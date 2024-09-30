package ru.mirea.practice.s23k0362.task7;

import java.util.Arrays;

public class BookShlef {
    private Book[] arrBooks;
    private int amountOfBook = 0;

    public BookShlef(int amountOfBook) {
        this.arrBooks = new Book[amountOfBook];
    }

    public BookShlef adding(BookShlef arr, Book newOne) {
        if (amountOfBook < arr.arrBooks.length) {
            arr.arrBooks[amountOfBook] = newOne;
            amountOfBook++;
        }
        return arr;
    }

    public Book findLatest(BookShlef bok) {
        int latest = 0;
        Book temp = new Book("", "", 0);
        for (int i = 0; i < bok.arrBooks.length; i++) {
            if (latest < bok.arrBooks[i].getyear()) {
                temp = bok.arrBooks[i];
                latest = bok.arrBooks[i].getyear();
            }
        }
        return temp;
    }

    public Book findNewest(BookShlef bok) {
        int latest = bok.arrBooks[0].getyear();
        Book temp = new Book("", "", 0);
        for (int i = 0; i < bok.arrBooks.length; i++) {
            if (latest > bok.arrBooks[i].getyear()) {
                temp = bok.arrBooks[i];
                latest = bok.arrBooks[i].getyear();
            }
        }
        return temp;
    }

    public BookShlef sortByYear(BookShlef mas) {
        boolean isSorted = false;
        Book temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < this.amountOfBook - 1; i++) {
                if (mas.arrBooks[i].getyear() > mas.arrBooks[i + 1].getyear()) {
                    isSorted = false;
                    temp = mas.arrBooks[i];
                    mas.arrBooks[i] = mas.arrBooks[i + 1];
                    mas.arrBooks[i + 1] = temp;
                }
            }
        }
        return mas;
    }

    @Override
    public String toString() {
        return "Ur bookshelf:\n"
                + Arrays.toString(this.arrBooks);
    }
}
