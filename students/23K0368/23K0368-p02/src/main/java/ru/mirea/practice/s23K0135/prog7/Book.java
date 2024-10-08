package ru.mirea.practice.s23K0135.prog7;

public class Book {
    private String author;
    private String title;
    private Integer year;
    private String pages;

    public Book(String author, String title, Integer year, String pages) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getStranichy() {
        return pages;
    }

    public void setStranichy(String stranichy) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" + "Author='" + author + '\''
                + ", Title='" + title + '\'' + ", Year='" + year + '\'' + ", Stranichy='" + pages + '\'' + '}';
    }
}
