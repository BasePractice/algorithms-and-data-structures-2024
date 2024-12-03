package ru.mirea.practices0000001.task4.task8;

public abstract class PrintableApp {
    public static void main(String[] args) {

        Printable[] printables = new Printable[4];

        printables[0] = new Book("Колобок");
        printables[1] = new Magazine("Мурзилка");
        printables[2] = new Book("Три поросёнка");
        printables[3] = new Magazine("Звезда");

        Book.printBooks(printables);
    }
}