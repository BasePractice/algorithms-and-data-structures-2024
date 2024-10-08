package ru.mirea.practice.s23K0135.task1;

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Book: " + title);
    }

    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}
