package ru.mirea.practice.s23k0116.priceable;

public class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product:\nname= "
                + name + "\n"
                + "price= " + price + "\n";
    }
}
