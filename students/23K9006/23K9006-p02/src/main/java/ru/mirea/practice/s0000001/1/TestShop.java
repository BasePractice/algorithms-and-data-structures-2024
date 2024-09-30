package ru.mirea.practice.s0000001

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Показать все компьютеры");
            System.out.println("5. Выйти");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите бренд: ");
                    String brand = scanner.nextLine();
                    System.out.print("Введите модель: ");
                    String model = scanner.nextLine();
                    System.out.print("Введите цену: ");
                    double price = scanner.nextDouble();
                    Computer computer = new Computer(brand, model, price);
                    shop.addComputer(computer);
                    break;
                case 2:
                    System.out.print("Введите модель компьютера для удаления: ");
                    model = scanner.nextLine();
                    shop.removeComputer(model);
                    break;
                case 3:
                    System.out.print("Введите модель компьютера для поиска: ");
                    model = scanner.nextLine();
                    Computer foundComputer = shop.findComputer(model);
                    if (foundComputer != null) {
                        System.out.println("Найден компьютер: " + foundComputer);
                    }
                    break;
                case 4:
                    shop.displayComputers();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        scanner.close();
        System.out.println("Работа завершена.");
    }
}

