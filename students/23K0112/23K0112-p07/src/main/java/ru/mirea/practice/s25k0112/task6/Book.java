package ru.mirea.practice.s25k0112.task6;

public class Book implements Printable {
    static String kind = "Book";
    public String name;
    public String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public static void printBooks(Printable[] printable) {
        for (Printable item: printable) {
            if (item instanceof Book) {
                item.print();
            }
        }
    }

    public void print() {
        System.out.printf("Kind: %s\nName: %s\nAuthor: %s\n\n", kind, name, author);
    }
}
