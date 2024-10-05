package ru.mirea.practice.s23L0908.prog4;


public class Cars implements Priceable {
    String name;
    String color;
    Double price;

    Cars(String name, String color, Double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cars{"
                + "name='" + name + '\''
                + ", color='" + color + '\''
                + ", price=" + price
                + '}';
    }

}
