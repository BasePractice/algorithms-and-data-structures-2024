package ru.mirea.practice.s0000001;

class BookShelf {
    private Book[] books;
    private int count;

    public BookShelf(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        }
    }

    public Book getOldestBook() {
        Book oldest = books[0];
        for (Book book : books) {
            if (book != null && book.getYear() < oldest.getYear()) {
                oldest = book;
            }
        }
        return oldest;
    }

    public Book getNewestBook() {
        Book newest = books[0];
        for (Book book : books) {
            if (book != null && book.getYear() > newest.getYear()) {
                newest = book;
            }
        }
        return newest;
    }
}
