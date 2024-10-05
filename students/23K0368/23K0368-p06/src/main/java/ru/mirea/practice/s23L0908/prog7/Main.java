package ru.mirea.practice.s23L0908.prog7;

public abstract class Main {
    public static void main(String[] arg) {
        Book book = new Book("10", "Vasua");
        System.out.println(book);// так как не обявлен toString будет интересный вывод

        book.print();
    }
}
