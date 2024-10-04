package ru.mirea.practice.s25k0112.task6;

public final class Test {
    private Test() {

    }

    public static void main(String[] args) {
        Printable[] shelf = {new Book("Lord of Rings", "Tolkien"), new Book("Crime and Punishment",
                "Dostoevskiy"), new Magazine("Sobaka"), new Magazine("Dacha")};

        Magazine.printMagazines(shelf);
        Book.printBooks(shelf);
    }
}
