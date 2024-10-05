package ru.mirea.practice.s23k0359.studyperson.task4;

public class Object implements Priceable {
    private final String name;
    private final float price;
    private final int amount;

    public Object(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public float getPrice() {
        return price * amount;
    }

    @Override
    public String toString() {
        return "Стоимость " + name + " равна " + getPrice() + " рублей.";
    }
}