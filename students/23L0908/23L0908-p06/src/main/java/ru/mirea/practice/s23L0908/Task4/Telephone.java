package ru.mirea.practice.s23L0908.Task4;

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

    public void setPrice() {
        this.price = price;
    }

    public double getPrice(double price) {
        return price;
    }

    public void setSize() {
        this.size = size;
    }

    public int getSize(int size) {
        return size;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public String getBrand(String brand) {
        return brand;
    }

    public void setColor() {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void getPrice() {
        System.out.println("The telephone is " + this.price + " USD\n"
            + this.size + " inches, made by " + this.brand + "and have " + this.color);
    }
}
