package ru.mirea.practice.s23L0908;

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
