package ru.mirea.practice.s23K0135.task7and8;

public abstract class TesterOfShop {
    public static void main(String[] args) {
        Printable[] a = {
            new Book("qwer", "asdf"),
            new Book("tyui", "JSd"),
            new Book("12", "brnkel"),};
        Book q = new Book("q", "w");
        q.printBook(a);
    }
}
