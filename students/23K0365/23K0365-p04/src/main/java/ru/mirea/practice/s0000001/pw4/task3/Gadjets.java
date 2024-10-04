package ru.mirea.practice.s0000001.pw4.task3;

public enum Gadjets implements ViewList {
    SMARTPHONE("Iphone 16", 100, 2),
    TV("Samsung sw13G800-b", 300, 5),
    CHARGER("Iphone's charger", 5, 3);

    private String description;
    private int price;;
    private int count;
    Gadjets(String description, int price, int count) {
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

    public int getCount() {
        return count;
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
        System.out.println("Name: " + name() + "\t" +
                getDescription() + "\tPrice: " +
                getPrice() + "\n");
    }
}