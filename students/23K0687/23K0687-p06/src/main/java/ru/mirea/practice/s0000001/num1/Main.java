package ru.mirea.practice.s0000001.num1;

public final class Main {

    private Main() {
        // Приватный конструктор, чтобы предотвратить создание экземпляра класса
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 1000);
        Service s = new Service("Web Hosting", 50);
        Subscription sub = new Subscription("Premium Plan", 200);

        Priceable[] items = {p, s, sub};

        printPrices(items);
    }

    public static void printPrices(Priceable[] items) {
        for (Priceable item : items) {
            System.out.println("Price: $" + item.getPrice());
        }
    }
}
