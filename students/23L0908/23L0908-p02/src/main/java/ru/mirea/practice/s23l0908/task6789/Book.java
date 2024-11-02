package ru.mirea.practice.s23l0908.task6789;

public class Book implements Comparable<Book> {
    private String author;
    private String name;
    private final String publishinghouse;
    private int released;

    public Book(String author, String name, String publishinghouse, int released) {
        this.author = author;
        this.name = name;
        this.publishinghouse = publishinghouse;
        this.released = released;
    }

    public String getAuthor() {
        return author;
    }

    @SuppressWarnings("unused")
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingHouse() {
        return publishinghouse;
    }

    public int getReleased() {
        return released;
    }

    @SuppressWarnings("unused")
    public void setReleased(int released) {
        this.released = released;
    }

    @Override
    public int compareTo(Book obj) {
        return this.released - obj.released;
    }

    @Override
    public String toString() {
        return "Book{"
            +
            "author='"
            + author
            + '\''
            +
            ", name='"
            + name
            + '\''
            +
            ", publishingHouse='"
            + publishinghouse
            + '\''
            +
            ", released="
            + released
            +
            '}';
    }
}
