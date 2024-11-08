package ru.mirea.practice.s0000001.task2;

// Класс-элемент
class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "'}";
    }
}
