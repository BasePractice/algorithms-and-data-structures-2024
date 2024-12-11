package ru.mirea.practice.s230k754.lab4.task3;

import java.util.Objects;

public enum Products {
    LEMON("vegetables", 1),
    TOMATO("vegetables", 1),
    POTATO("vegetables", 1),
    CARROT("vegetables", 1),
    APPLE("fruits", 1),
    BANANA("fruits", 1);

    private final String typeProduct;
    private final String[] catalog;
    private final int price;

    Products(String typeProduct, int price) {
        this.typeProduct = typeProduct;
        this.catalog = new String[]{"vegetables", "fruits"};
        this.price = price;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void getListCatalogs() {
        for (String obj: catalog) {
            System.out.printf("%s ",obj);
        }
        System.out.print("\n");
    }

    public void getListProductCatalog(String clientCatalog) {
        if (Objects.equals(clientCatalog, catalog[0])) {
            for (Products product: Products.values()) {
                if (product.getTypeProduct().equals(clientCatalog)) {
                    System.out.println(product);
                }
            }
        }
    }

    public static boolean contains(String clientProduct) {
        for (Products product: Products.values()) {
            if (product.name().equalsIgnoreCase(clientProduct)) {
                return true;

            }
        }
        return false;
    }

    public int getPrice() {
        return price;
    }
}
