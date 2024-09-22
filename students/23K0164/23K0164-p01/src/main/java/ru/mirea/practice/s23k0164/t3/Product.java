package ru.mirea.practice.s23k0164.t3;

public class Product {
    private String name;
    private int price;
    private String catalog;


    public Product(String name, int price, String catalog) {
        this.name = name;
        this.price = price;
        this.catalog = catalog;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCatalog() {
        return catalog;
    }

    @Override
    public String toString() {
        return " Товар{" +
                "Название='" + name + '\'' +
                ", цена='" + price + '\'' +
                ", каталог='" + catalog + '\'' +
                '}';
    }
}

