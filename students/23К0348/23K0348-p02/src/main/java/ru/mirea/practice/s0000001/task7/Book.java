package ru.mirea.practice.s0000001.task7;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

class BookShelf {
    private Book[] books;
    private int count;

    public BookShelf(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }

    public Book getLatestBook() {
        Book latest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }
        return latest;
    }
}

class BookTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(5);
        shelf.addBook(new Book("Book A", "Author A", 2000));
        shelf.addBook(new Book("Book B", "Author B", 2010));

        Book latest = shelf.getLatestBook();
        System.out.println("Latest Book: " + latest.getTitle() + " by " + latest.getAuthor());
    }
}
