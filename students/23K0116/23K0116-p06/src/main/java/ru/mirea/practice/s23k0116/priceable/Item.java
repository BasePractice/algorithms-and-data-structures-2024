package ru.mirea.practice.s23k0116.priceable;

public class Item implements Priceable {
    private String itemName;
    private double pricePerUnit;
    private int quantity;

    public Item(String itemName, double pricePerUnit, int quantity) {
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return pricePerUnit * quantity; // Общая цена = цена за единицу * количество
    }

    @Override
    public String toString() {
        return "Item\nname="
                + itemName + "\n"
                + "totalPrice=" + getPrice() + "\n";
    }
}