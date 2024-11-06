package ru.mirea.practice.s24k0112.task6;

public final class Test {
    private Test() {

    }

    public static void main(String[] args) {
        Printable[] books = {new Book("Lord of Rings", "Tolkien"), new Book("War and peace",
                "Tolstoi")};
        for (Printable book : books) {
            book.print();
        }
    }
}
