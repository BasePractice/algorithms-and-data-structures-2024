package ru.mirea.practice.s23K0135.pw41.task9;

public abstract class Furiture {
    protected String color;
    protected double width;
    protected double lenght;
    protected String material;
    protected double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public Furiture(String color, double width, double lenght, String material, double price) {
        this.color = color;
        this.width = width;
        this.lenght = lenght;
        this.material = material;
        this.price = price;
    }
}
