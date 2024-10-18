package ru.mirea.practice.s23l0908.Task6_7_8_9;

public class Book implements Printable {
    private double price;
    private String name;

    public Book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void print() {
        System.out.println("This book is " + this.price + "USD and called: " + this.name);
    }
}
