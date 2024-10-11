package ru.mirea.practice.s0000006.task6789;

public final class Main {
    private Main() {
        // Приватный конструктор предотвращает создание экземпляров класса
    }

    public static void main(String[] args) {
        Printable[] printables = new Printable[4];

        printables[0] = new Book("Sherlock Holmes: A Study in Scarlet", "Arthur Conan Doyle");
        printables[1] = new Book("Sherlock Holmes: The Hound of the Baskervilles", "Arthur Conan Doyle");
        printables[2] = new Magazine("Sherlock Magazine", "Issue 1 - January 2024");
        printables[3] = new Magazine("The Detective Monthly", "March 2024");

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
