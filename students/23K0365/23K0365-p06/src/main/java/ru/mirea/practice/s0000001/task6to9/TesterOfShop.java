package ru.mirea.practice.s0000001.task6to9;

public abstract class TesterOfShop {
    public static void main(String[] args) {
        Printable[] a = {
            new Book("qwer", "asdf", "journal"),
            new Book("tyui", "JSd", "book"),
            new Book("12", "brnkel", "journal"),};
        for (Printable x : a) {
            x.print();
        }
    }
}
