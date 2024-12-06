package ru.mirea.practice.s23l0908.task6789;

public class Book implements Printable {
    private final double price;
    private final String name;

    public Book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void print() {
        System.out.println("This book is " + this.price + "USD and called: " + this.name);
    }
}
