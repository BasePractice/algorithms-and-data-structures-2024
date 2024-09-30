package ru.mirea.practice.s23k0362.pw4.task3;

public enum Dishes implements ViewList {
    PLATES("The pack of 5 plates", 3, 8),
    FORKS("The pack of 5 forks", 2, 5),
    SPOONS("The pack of 5 spoons", 4, 4);

    private String description;
    private int price;
    private int count;

    Dishes(String description, int price, int count) {
        this.description = description;
        this.price = price;
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String seeDescription() {
        return this.description;
    }

    public void minusOne() {
        this.count -= 1;
    }

    public int viewPrice() {
        return getPrice();
    }

    public void print() {
        System.out.println("Name: " + name() + "\t"
                + getDescription() + "\tPrice: "
                + getPrice() + "\n");
    }
}