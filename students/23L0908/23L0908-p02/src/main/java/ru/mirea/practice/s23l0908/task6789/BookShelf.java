package ru.mirea.practice.s23l0908.task6789;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookShelf {
    int amount;
    List<Book> books;

    public BookShelf(int amount) {
        this.amount = amount;
        this.books = new ArrayList<>();
    }

    public boolean add(String author, String name, String publishinghouse, int released) {
        if (books.size() == this.amount) {
            return false;
        }

        boolean status = false;

        for (Book book : books) {
            if (book.getName().equals(name)
                && book.getPublishingHouse().equals(publishinghouse)
                && book.getAuthor().equals(author)
                && book.getReleased() == released) {
                status = true;
                break;
            }
        }
        if (!status) {
            books.add(new Book(author, name, publishinghouse, released));
        }
        return !status;
    }


    public Book getEarliest() {
        List<Book> copy = new ArrayList<>(books);
        Collections.sort(copy);
        return copy.get(0);
    }

    public Book getLatest() {
        List<Book> copy = new ArrayList<>(books);
        Collections.sort(copy);
        return copy.get(copy.size() - 1);
    }

    public void sort() {
        Collections.sort(books);
    }

    @Override
    public String toString() {
        if (books.isEmpty()) {
            return "There isn't any books yet.\n";
        }

        StringBuilder line = new StringBuilder("There is " + books.size() + " books on your shelf:\n");
        for (Book book : books) {
            line.append(book.toString()).append("\n");
        }

        return line.toString();
    }
}
