package ru.mirea.practice.s0000001.task1.task2;

public class Book implements Printable { // Класс Book
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
    }

    public String getTitle() {
        return title;
    }
}