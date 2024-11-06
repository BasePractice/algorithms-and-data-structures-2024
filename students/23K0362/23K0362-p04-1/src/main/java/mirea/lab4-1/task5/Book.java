package mirea.lab9.task5;

public class Book {
    private String nameBook;
    private String nameAuthor;

    public Book(String nameBook, String nameAuthor) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
}
