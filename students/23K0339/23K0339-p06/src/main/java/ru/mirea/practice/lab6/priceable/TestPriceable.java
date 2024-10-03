package ru.mirea.practice.lab6.priceable;

public abstract class TestPriceable {
    public static void main(String[] args) {
        Priceable product = new Car("Lada Largus", 999.99);
        Priceable service = new Service("Teaching", 59.69);

        System.out.println(product);
        System.out.println("Price: $" + product.getPrice());

        System.out.println(service);
        System.out.println("Price: $" + service.getPrice());
    }
}

