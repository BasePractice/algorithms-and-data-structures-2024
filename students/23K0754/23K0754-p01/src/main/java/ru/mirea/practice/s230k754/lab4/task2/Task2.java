package ru.mirea.practice.s230k754.lab4.task2;


public final class Task2 {
    private Task2() {}

    public static void main(String[] args) {
        Object[] items = new Object[4];

        items[0] = new Pants(39.99, 32, "b");
        items[1] = new Skirt(59.99, 34, "r");
        items[2] = new Tie(59.99, 40, "r");
        items[3] = new TShirt(59.99, 38, "r");

        Atelier atelier = new Atelier(items);
        atelier.dressWomen();
        atelier.dressMan();

    }
}
