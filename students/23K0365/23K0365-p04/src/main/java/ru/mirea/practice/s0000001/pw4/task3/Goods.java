package ru.mirea.practice.s0000001.pw4.task3;

public enum Goods {
    PLATES("The pack of 5 plates", 3, 8, "dish"),
    FORKS("The pack of 5 forks", 2, 5, "dish"),
    SPOONS("The pack of 5 spoons", 4, 4, "dish"),
    SMARTPHONE("Iphone 16", 100, 2, "gadjet"),
    TV("Samsung sw13G800-b", 300, 5, "gadjet"),
    CHARGER("Iphone's charger", 5, 3, "gadjet");

    private String description;
    private int count;
    private String category;

    Goods(String description, int price, int count, String category) {
        this.description = description;
        this.price = price;
        this.count = count;
        this.category = category;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCount() {
        return count;
    }



    }
