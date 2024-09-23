package ru.mirea.practice.s23k0120.task7.book;

import java.sql.Date;

public class Book {
    private String author;
    private String name;
    private Date date;

    public Book(String author, String name, Date date) {
        this.author = author;
        this.name = name;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
