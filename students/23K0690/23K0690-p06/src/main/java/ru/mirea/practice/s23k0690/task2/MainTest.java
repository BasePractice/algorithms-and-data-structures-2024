package ru.mirea.practice.s23k0690.task2;

public final class MainTest {

    private MainTest() {}

    public static void main(String[] args) {
        Priceable product = new Product("Laptop", 1200.99);
        Priceable service = new Service("Consulting", 150.00);

        System.out.println("Product: " + ((Product) product).getName() + ", Price: " + product.getPrice());
        System.out.println("Service: " + ((Service) service).getDescription() + ", Price: " + service.getPrice());
    }
}
