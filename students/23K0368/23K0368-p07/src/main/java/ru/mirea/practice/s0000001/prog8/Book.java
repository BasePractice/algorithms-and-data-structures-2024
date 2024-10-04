package ru.mirea.practice.s0000001.prog8;

class Book implements Printable {
    String name;
    String author;
    int year;

    public String getName() {
        return name;
    }

    Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", name, author, year);
    }

    public static void printBook(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                System.out.println(((Book) item).getName());
            }
        }
    }
}
