package ru.mirea.practice.s23k0140.task4;

public abstract class Main {
    public static void main(String[] args) {
        Priceable banana = new Banana(100.0);
        Priceable apple = new Apple(120.0);
        Priceable cherry = new Cherry(150.0);

        System.out.println("Цена бананов: " + banana.getPrice() + " руб/кг");
        System.out.println("Цена яблок: " + apple.getPrice() + " руб/кг");
        System.out.println("Цена вишни: " + cherry.getPrice() + " руб/кг");
    }
}