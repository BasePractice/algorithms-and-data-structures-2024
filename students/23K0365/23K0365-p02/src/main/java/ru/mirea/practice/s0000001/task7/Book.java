package ru.mirea.practice.s0000001.task7;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    //    public void setAuthor(String author) {this.author = author;}
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getyear() {
        return year;
    }
    //public void setyear(int year) {this.year = year;}

    @Override
    public String toString() {
        return "This book's Author is "
                + author + ". Year of publication - "
                + year + ". It's name is '" + name + ".\n";
    }
}
