package ru.mirea.practice.s23L0908;

public class BookShelf {
    private Book[] books;
    private int n;
    private int size;

    public BookShelf(int size) {
        this.books = new Book[size];
        this.n = 0;
        this.size = size;
    }

    public void addBook(Book book) {
        if (n < size) {
            books[n] = book;
            n++;
        } else {
            System.out.println("shelf if full");
        }
    }

    public Book getBook(int n) {
        return books[n];
    }

    public Book earliest() {
        Book min = null;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                min = books[i];
            }
            if (books[i].getYear() < min.getYear()) {
                min = books[i];
            }
        }
        return min;
    }

    public Book latest() {
        Book max = null;
        for (int i = 0;i < n;i++) {
            if (i == 0) {
                max = books[i];
            }
            if (books[i].getYear() > max.getYear()) {
                max = books[i];
            }
        }
        return max;
    }

    public void sort() {
        Book book;
        int f = 0;
        for (int i = 0;i < n;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    book = books[j];
                    this.books[j] = books[j + 1];
                    this.books[j + 1] = book;
                    f = 1;
                }
            }
            if (f == 0) {
                break;
            }
        }
    }
}
