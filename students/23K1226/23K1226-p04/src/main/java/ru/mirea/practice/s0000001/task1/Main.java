package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        // Задание 1 (Времена года)
        Seasons favoriteSeason = Seasons.SUMMER;
        System.out.println(favoriteSeason + " - " + favoriteSeason.getAverageTemperature() + "°C, " + favoriteSeason.getDescription());
        printSeasonMessage(favoriteSeason);

        for (Seasons season : Seasons.values()) {
            System.out.println(season + ": " + season.getAverageTemperature() + "°C, " + season.getDescription());
        }

        // Задание 2 (Ателье)
        Clothes[] clothesArray = {
            new TShirt(Sizes.M, 20, "Белый"),
            new Pants(Sizes.L, 50, "Черный"),
            new Skirt(Sizes.S, 30, "Красный"),
            new Tie(Sizes.XS, 15, "Синий")
        };
        Atelier atelier = new Atelier();
        atelier.dressWomen(clothesArray);
        atelier.dressMen(clothesArray);

        // Задание 3 (Интернет-магазин)
        try (Scanner scanner = new Scanner(System.in)) {
            User user = new User("user1", "password1");
            boolean authenticated = user.authenticate(scanner);

            if (authenticated) {
                Catalog[] catalogs = {new Catalog("Электроника"), new Catalog("Одежда")};
                for (Catalog catalog : catalogs) {
                    catalog.displayProducts();
                }
                Cart cart = new Cart();
                cart.addProduct(new Product("Ноутбук", 1000));
                cart.addProduct(new Product("Футболка", 20));
                cart.purchaseProducts();
            }

            // Задание 4 (Компьютер)
            Computer computer = new Computer(
                    new Processor("Intel", 3.6),
                    new Memory("Kingston", 16),
                    new Monitor("Dell", 24)
            );
            System.out.println(computer);
        }
    }

    public static void printSeasonMessage(Seasons season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            default:
                break;
        }
    }
}
