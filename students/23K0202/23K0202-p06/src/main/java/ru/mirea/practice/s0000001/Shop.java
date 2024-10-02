package ru.mirea.practice.s0000001;

class Shop implements Printable {
    private final String shop;

    public Shop(String shop) {
        this.shop = shop;
    }

    @Override
    public void print() {
        System.out.println("Магазин: " + shop);
    }
}