package ru.mirea.practice.s23k0093;

public abstract class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[]{
            new Magazine("Журнал 1"),
            new Magazine("Журнал 2"),
            new Book("Книга 1"),      // Допустим, есть класс Book, который не является журналом
            new Magazine("Журнал 3")
        };

        Magazine.printMagazines(printables);
    }
}