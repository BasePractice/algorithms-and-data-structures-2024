package ru.mirea.practice.s0000001.task2;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        Priceables p = new Products("ноутбук", 1200.00);
        Priceables s = new Serv("Консультирование", 150.00);

        System.out.println(p);
        System.out.println(s);
    }
}