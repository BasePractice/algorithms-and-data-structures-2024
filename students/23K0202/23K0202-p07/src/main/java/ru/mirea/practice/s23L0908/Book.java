package ru.mirea.practice.s23L0908;

class Book implements Printable {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
