package ru.mirea.practice.s0000001.n4;

public final class MainApplication {

    private MainApplication() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Priceable product = new Product("Laptop", 1200.50);
        Priceable car = new Car("LADA", 55000);
        Priceable service = new Service("Web Hosting", 19.99);

        System.out.println(product.toString());
        System.out.println(car.toString());
        System.out.println(service.toString());
    }
}