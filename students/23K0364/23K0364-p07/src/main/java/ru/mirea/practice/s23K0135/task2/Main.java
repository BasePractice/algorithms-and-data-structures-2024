package ru.mirea.practice.s23K0135.task2;

public abstract class Main {
    public static void main(String[] args) {
        Printable[] printableItems = {
            new Book("Богатый папа - бедный папа"),
            new Magazine("Успешный успех"),
            new Book("Как меньше тратить"),
            new Magazine("Экономная экономия")
        };
        Book.printBooks(printableItems);
    }
}

