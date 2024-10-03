package ru.mirea.practice.s23k0164.t2;

public abstract class Clothes {
    private SizeClothers.ListSize size;
    private double price;
    private String color;


    public Clothes(SizeClothers.ListSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public SizeClothers.ListSize getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Clothes{"
                + "size='" + size.getSize() + '\''
                + ", color='" + color + '\''
                + ", price='" + price + '\''
                + '}';
    }
}
