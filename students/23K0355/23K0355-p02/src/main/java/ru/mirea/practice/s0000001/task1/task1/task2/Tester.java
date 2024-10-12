package ru.mirea.practice.s0000001.task1.task1.task2;

import java.util.Scanner;

public final class Tester {

    private Tester() {}

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Shop shop = new Shop();

            System.out.println("Введите количество компьютеров для добавления:");
            int n = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.println("Введите бренд компьютера " + (i + 1) + ":");
                final String brand = scanner.nextLine(); // Объявление как final
                System.out.println("Введите модель компьютера " + (i + 1) + ":");
                String model = scanner.nextLine();
                System.out.println("Введите цену компьютера " + (i + 1) + ":");
                double price = scanner.nextDouble();
                scanner.nextLine();

                shop.addComputer(new Computer(brand, model, price));
            }

            System.out.println("Текущие компьютеры в магазине:");
            shop.printComputers();

            System.out.println("Введите бренд компьютера для удаления:");
            String brandToRemove = scanner.nextLine();
            shop.removeComputerByBrand(brandToRemove);

            System.out.println("Текущие компьютеры в магазине после удаления:");
            shop.printComputers();

            System.out.println("Введите бренд компьютера для поиска:");
            String brandToFind = scanner.nextLine();
            Computer foundComputer = shop.findComputerByBrand(brandToFind);
            if (foundComputer != null) {
                System.out.println("Компьютер найден: " + foundComputer);
            } else {
                System.out.println("Компьютер не найден.");
            }
        }
    }
}