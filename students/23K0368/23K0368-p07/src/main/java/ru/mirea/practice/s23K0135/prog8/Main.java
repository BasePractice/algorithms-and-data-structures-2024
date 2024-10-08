package ru.mirea.practice.s23K0135.prog8;

public abstract class Main {
    public static void main(String[] args) {
        //руализация функции из задания
        Printable[] printableArray = {new Magazine("Top Gear"),
            new Book("Война и мир", "Л. Толстой", 1828),
            new Magazine("Металлинвест")};

        Book.printBook(printableArray);
    }
}
