package ru.mirea.practice.s23K0135.pw41.task5;

public abstract class TestLibrary {
    public static void main(String[] args) {
        Reader a = new Reader("A.P.", 1234567890,
            "qwer", "09.09.09", 1);
        Reader b = new Reader("G.H.", 2,
            "qazwsxedc", "1234", 7893291);
        Reader[] arr = {
            a,
            b
        };
        Book[] books = {
            new Book("qwer", "qaz"),
            new Book("!!!!!", "????"),
            new Book("TYUI", ".")
        };
        a.returnBook(67867);
        b.returnbook(books);
        a.takebook(books);
        b.takeBook(0);
    }
}
