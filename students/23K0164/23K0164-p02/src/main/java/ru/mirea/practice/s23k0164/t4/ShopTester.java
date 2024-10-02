package ru.mirea.practice.s23k0164.t4;

import java.util.List;
import java.util.Scanner;

public final class ShopTester {

    private ShopTester() {

    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Добро пожаловать в магазин компьютеров!");

            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Добавить компьютер");
                System.out.println("2. Поиск компьютера");
                System.out.println("3. Показать все компьютеры");
                System.out.println("4. Выйти");

                int choice = -1;
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    System.out.println("Пожалуйста, введите число.");
                    scanner.nextLine();
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Введите марку компьютера: ");
                        String brand = scanner.nextLine();
                        System.out.print("Введите модель компьютера: ");
                        String model = scanner.nextLine();
                        System.out.print("Введите цену компьютера: ");
                        if (scanner.hasNextDouble()) {
                            double price = scanner.nextDouble();
                            scanner.nextLine(); // Consume newline
                            shop.addComputer(new Computer(brand, model, price));
                            System.out.println("Компьютер добавлен в магазин.");
                        } else {
                            System.out.println("Неверный формат цены. Попробуйте снова.");
                            scanner.nextLine();
                        }
                        break;
                    case 2:
                        System.out.print("Введите критерий поиска: ");
                        String criteria = scanner.nextLine();
                        List<Computer> results = shop.searchComputers(criteria);
                        if (results.isEmpty()) {
                            System.out.println("Компьютеры не найдены.");
                        } else {
                            System.out.println("Найденные компьютеры:");
                            for (Computer computer : results) {
                                System.out.println(computer);
                            }
                        }
                        break;
                    case 3:
                        System.out.println(shop);
                        break;
                    case 4:
                        System.out.println("До свидания!");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        break;
                }
            }
        }
    }
}