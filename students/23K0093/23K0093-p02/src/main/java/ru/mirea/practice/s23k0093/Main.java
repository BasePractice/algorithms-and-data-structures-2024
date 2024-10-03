package ru.mirea.practice.s23k0093;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nВведите команду (add, remove, find, list, exit):");
                String command = scanner.nextLine();
                switch (command) {
                    case "add":
                        System.out.println("Введите бренд и модель через пробел:");
                        String[] input = scanner.nextLine().split(" ");
                        shop.addComputer(new Computer(input[0], input[1]));
                        break;

                    case "remove":
                        System.out.println("Введите бренд и модель для удаления через пробел:");
                        String[] removeInput = scanner.nextLine().split(" ");
                        shop.removeComputer(removeInput[0], removeInput[1]);
                        break;

                    case "find":
                        System.out.println("Введите бренд и модель для поиска через пробел:");
                        String[] findInput = scanner.nextLine().split(" ");
                        Computer found = shop.findComputer(findInput[0], findInput[1]);
                        System.out.println(found != null ? "Найден: " + found : "Компьютер не найден.");
                        break;

                    case "list":
                        shop.listComputers();
                        break;

                    case "exit":
                        System.out.println("Выход из программы.");
                        break;

                    default:
                        System.out.println("Неизвестная команда.");
                        break;
                }
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}