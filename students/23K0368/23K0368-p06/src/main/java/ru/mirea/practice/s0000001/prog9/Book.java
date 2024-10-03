package ru.mirea.practice.s0000001.prog9;

public class Book implements Printable {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void print() {
        System.out.println("Title: " + title + " Author: " + author);
    }
}
