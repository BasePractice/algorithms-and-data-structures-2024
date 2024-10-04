package ru.mirea.practice.s0000001.task1;

class Catalog {
    private String name;
    private Product[] products;

    public Catalog(String name) {
        this.name = name;
        this.products = new Product[]{
            new Product("Товар 1", 100),
            new Product("Товар 2", 200)
        };
    }

    public void displayProducts() {
        System.out.println("Каталог: " + name);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
