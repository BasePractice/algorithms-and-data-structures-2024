package ru.mirea.practice.s0000001.n4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Computer> computers;

    public Shop() {
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен: " + computer);
    }

    public void removeComputer(String name) {
        boolean removed = computers.removeIf(computer -> computer.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Компьютер с именем " + name + " удален.");
        } else {
            System.out.println("Компьютер с именем " + name + " не найден:(");
        }
    }

    public Computer findComputer(String name) {
        for (Computer computer : computers) {
            if (computer.getName().equalsIgnoreCase(name)) {
                return computer;
            }
        }
        return null;
    }

    public void displayComputers() {
        if (computers.isEmpty()) {
            System.out.println("В магазине нет компьютеров");
        } else {
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
    }

    static class Computer {
        private String name;
        private String processor;
        private int ram;

        public Computer(String name, String processor, int ram) {
            this.name = name;
            this.processor = processor;
            this.ram = ram;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Компьютер{" + "имя='" + name + '\'' + ", процессор='" + processor + '\'' + ", оперативная память=" + ram + " ГБ}";
        }
    }

    public void startInterface() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("\n1. Добавить компьютер");
                System.out.println("2. Удалить компьютер");
                System.out.println("3. Найти компьютер");
                System.out.println("4. Показать все компьютеры");
                System.out.println("5. Выйти");
                System.out.print("Выберите опцию: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addComputerInterface(scanner);
                        break;
                    case 2:
                        removeComputerInterface(scanner);
                        break;
                    case 3:
                        findComputerInterface(scanner);
                        break;
                    case 4:
                        displayComputers();
                        break;
                    case 5:
                        running = false;
                        System.out.println("Выход...");
                        break;
                    default:
                        System.out.println("Неверная опция:( попробуйте снова");
                        break;
                }
            }
        }
    }

    private void addComputerInterface(Scanner scanner) {
        System.out.println("Введите название компьютера:");
        final String name = scanner.nextLine();

        System.out.println("Введите процессор:");
        String processor = scanner.nextLine();

        System.out.println("Введите объем оперативной памяти (ГБ):");
        int ram = scanner.nextInt();
        scanner.nextLine();

        Computer computer = new Computer(name, processor, ram);
        addComputer(computer);
    }

    private void removeComputerInterface(Scanner scanner) {
        System.out.println("Введите название компьютера для удаления:");
        final String name = scanner.nextLine();
        removeComputer(name);
    }

    private void findComputerInterface(Scanner scanner) {
        System.out.println("Введите название компьютера для поиска:");
        final String name = scanner.nextLine();
        Computer computer = findComputer(name);
        if (computer != null) {
            System.out.println("Компьютер найден: " + computer);
        } else {
            System.out.println("Компьютер не найден");
        }
    }
}