package ru.mirea.practice.s0000001.task1.task2;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        Printable[] items = {
            new Magazine("Технологии Будущего"),
            new Book("Программирование на python"),
            new Magazine("Наука"),
            new Book("Горе от ума")
        };

        Magazine.printMagazines(items);
    }
}