package ru.mirea.practice.s23k0143;

class Table extends Furniture {
    private String material;

    public Table(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол: " + name + ", Цена: " + price + ", Материал: " + material);
    }
}