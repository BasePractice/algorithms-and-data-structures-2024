package ru.mirea.practice.s23k0093;

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getName() {
        return title;
    }
}