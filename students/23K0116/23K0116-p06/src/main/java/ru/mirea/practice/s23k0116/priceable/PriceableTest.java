package ru.mirea.practice.s23k0116.priceable;

public abstract class PriceableTest {
    public static void main(String[] args) {
        Priceable[] priceables = new Priceable[3];

        // Создание объектов
        priceables[0] = new Product("Laptop", 1200.50);
        priceables[1] = new Item("Apples", 2.5, 10);
        priceables[2] = new Product("Phone", 700.00);


        // Вывод информации о ценах
        for (Priceable priceable : priceables) {
            System.out.println(priceable + "\n");
        }
    }
}