package ru.mirea.practice.s0000001.task4;

public class Car implements Priceable {
    private int price;
    String model;

    public Car(int price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
