package ru.mirea.practice.s0000001.prog8;

public class Shop implements Printable {
    private String productName;
    private int productPrice;

    Shop(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void print() {
        System.out.println("Product Name: " + productName + ", Product Price: " + productPrice);
    }
}
