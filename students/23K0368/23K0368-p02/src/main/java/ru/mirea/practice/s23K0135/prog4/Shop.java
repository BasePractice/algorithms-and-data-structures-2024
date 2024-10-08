package ru.mirea.practice.s23K0135.prog4;

public class Shop {
    private String model;
    private Integer price;
    private String name;

    public Shop(String model, Integer price, String name) {
        this.model = model;
        this.price = price;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shop{" + "model='" + model + '\'' + ", price=" + price + ", name='" + name + '\'' + '}';
    }
}
