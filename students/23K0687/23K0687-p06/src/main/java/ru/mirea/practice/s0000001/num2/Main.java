package ru.mirea.practice.s0000001.num2;

public final class Main {

    private Main() {
        // Приватный конструктор для предотвращения создания экземпляра класса
    }

    public static void main(String[] args) {
        Printable[] items = {
            new Book("Java Programming"),
            new Book("Effective Java"),
            new Magazine("Time"),
            new Magazine("National Geographic")
        };

        for (Printable item : items) {
            item.print();
        }
    }
}
