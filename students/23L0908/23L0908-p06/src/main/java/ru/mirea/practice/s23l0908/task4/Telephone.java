package ru.mirea.practice.s23l0908.task4;

public class Telephone implements Priceable {
    private double price;
    private int size;
    private String brand;
    private String color;

    Telephone(double price, int size, String brand, String color) {
        this.price = price;
        this.size = size;
        this.brand = brand;
        this.color = color;
    }

    @SuppressWarnings("unused")
    public void setPrice(double price) {
        this.price = price;
    }

    @SuppressWarnings("unused")
    public double getPrice(double price) {
        return price;
    }

    public void getPrice() {
        System.out.println("The telephone is "
            + this.price
            + " USD\n"
            + this.size
            + " inches, made by "
            + this.brand
            + "and have "
            + this.color);
    }

    @SuppressWarnings("unused")
    public void setSize(int size) {
        this.size = size;
    }

    @SuppressWarnings("unused")

    public int getSize(int size) {
        return size;
    }

    @SuppressWarnings("unused")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @SuppressWarnings("unused")
    public String getBrand(String brand) {
        return brand;
    }

    @SuppressWarnings("unused")
    public void setColor(String color) {
        this.color = color;
    }

    @SuppressWarnings("unused")
    public String getColor() {
        return color;
    }

}
