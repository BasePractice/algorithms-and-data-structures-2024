package ru.mirea.practice.s23k0505.task4;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println("Чтобы посмотреть ассортимент магазина введите 'shop'");
        System.out.println("Чтобы добавить компьютер в магазин введите 'add'");
        System.out.println("Чтобы удалить компьютер из магазина введите 'remove'");
        System.out.println("Чтобы найти компьютер в магазине введите 'search'");
        System.out.println("Чтобы закрыть программу введите 'exit'");

        try (Scanner sc = new Scanner(System.in)) {
            String input = "";
            while (!"/end".equals(input)) {
                input = sc.nextLine();
                if ("shop".equals(input)) {
                    System.out.println(shop);
                } else if ("add".equals(input)) {
                    System.out.println("Введите название компьютера");
                    String name = sc.nextLine();
                    System.out.println("Введите количество оперативной памяти");
                    int ram = sc.nextInt();
                    if (!shop.add(name, ram)) {
                        System.out.println("Компьютер " + name + " с оперативной памятью " + ram + " ГБ добавлен в магазин");
                    } else {
                        System.out.println("Такой компьютер уже в магазине");
                    }
                } else if ("remove".equals(input)) {
                    System.out.println("Введите название компьютера");
                    String name = sc.nextLine();
                    System.out.println("Введите количество оперативной памяти");
                    int ram = sc.nextInt();
                    if (shop.remove(name, ram)) {
                        System.out.println("Компьютер " + name + " с оперативной памятью " + ram + " ГБ удалён из магазина ");
                    } else {
                        System.out.println("Такого компьютера нет в магазине");
                    }
                } else if ("search".equals(input)) {
                    System.out.println("Введите название компьютера");
                    String name = sc.nextLine();
                    System.out.println("Введите количество оперативной памяти");
                    int ram = sc.nextInt();
                    if (shop.search(name, ram)) {
                        System.out.println("Компьютер " + name + " с оперативной памятью " + ram + " ГБ найден");
                    } else {
                        System.out.println("Такого компьютера нет в магазине");
                    }
                } else if ("exit".equals(input)) {
                    System.exit(0);
                } else {
                    System.out.println("Введите новую команду");
                }

            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
