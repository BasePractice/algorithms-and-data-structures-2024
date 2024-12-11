package ru.mirea.practices0000001.task4.task8;

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title);
    }

    // Статический метод для вывода названий только книг
    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                System.out.println("Книга: " + ((Book) item).title);
            }
        }
    }
}