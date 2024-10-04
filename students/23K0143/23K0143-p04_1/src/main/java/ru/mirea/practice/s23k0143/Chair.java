package ru.mirea.practice.s23k0143;

class Chair extends Furniture {
    private int legs;

    public Chair(String name, double price, int legs) {
        super(name, price);
        this.legs = legs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул: " + name + ", Цена: " + price + ", Ножки: " + legs);
    }
}

