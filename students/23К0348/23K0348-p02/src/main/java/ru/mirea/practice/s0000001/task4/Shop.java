package ru.mirea.practice.s0000001.task4;

import java.util.ArrayList;
import java.util.Scanner;

class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}

class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(String name) {
        computers.removeIf(computer -> computer.getName().equals(name));
    }

    public Computer findComputer(String name) {
        for (Computer computer : computers) {
            if (computer.getName().equals(name)) {
                return computer;
            }
        }
        return null;
    }
}

class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя компьютера для добавления: ");
        String name = scanner.nextLine();
        shop.addComputer(new Computer(name));

        System.out.print("Введите имя компьютера для поиска: ");
        name = scanner.nextLine();
        Computer found = shop.findComputer(name);
        if (found != null) {
            System.out.println("Найден компьютер: " + found);
        } else {
            System.out.println("Компьютер не найден.");
        }
    }
}