package ru.mirea.practice.s23L0908.task9;

public class Table extends Furniture {

    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Это стол. Подходит для работы или приема пищи.";
    }
}
