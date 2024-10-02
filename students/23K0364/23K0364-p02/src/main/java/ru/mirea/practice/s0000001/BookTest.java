package ru.mirea.practice.s0000001;

public abstract class BookTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(5);
        shelf.addBook(new Book("Author Pushkin", "Onegin", 1823));
        shelf.addBook(new Book("Author Bulgakov", "Master and Margarita", 1966));
        shelf.addBook(new Book("Author Chekhov", "Cherry Orchard", 1904));

        System.out.println("Earliest Book: " + shelf.getEarliestBook().getTitle());
        System.out.println("Latest Book: " + shelf.getLatestBook().getTitle());

        shelf.sortBooksByYear();
        System.out.println("Books sorted by year:");
        for (int i = 0; i < 3; i++) {
            System.out.println(shelf.books[i].getTitle());
        }
    }
}
