package ru.mirea.practice.s23L0908;

import java.util.Scanner;
import java.util.Locale;

class ConsolInterface implements InterfaceShop {
    private Shop shop;

    public ConsolInterface() {
        this.shop = new Shop();
    }

    @Override
    public void start() {
        try (Scanner scanner = new Scanner(System.in)) { // Используем try-with-resources
            while (true) {
                System.out.println("1. Add Computer");
                System.out.println("2. Remove Computer");
                System.out.println("3. Search Computer");
                System.out.println("4. Display Computers");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                // Проверяем ввод пользователя
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine(); // очистка неверного ввода
                    continue; // возвращаемся к началу цикла
                }

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        addComputer(scanner);
                        break;
                    case 2:
                        removeComputer(scanner);
                        break;
                    case 3:
                        searchComputer(scanner);
                        break;
                    case 4:
                        shop.displayComputers();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    }

    private void addComputer(Scanner scanner) {
        System.out.print("Enter brand (DELL, HP, LENOVO, APPLE, ASUS): ");
        final Brand brand = Brand.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));

        System.out.print("Enter processor model: ");
        String processorModel = scanner.nextLine();
        System.out.print("Enter processor speed (GHz): ");
        double processorSpeed = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        final Processor processor = new Processor(processorModel, processorSpeed);

        System.out.print("Enter memory type: ");
        String memoryType = scanner.nextLine();
        System.out.print("Enter memory size (GB): ");
        int memorySize = scanner.nextInt();
        scanner.nextLine(); // consume newline
        final Memory memory = new Memory(memoryType, memorySize);

        System.out.print("Enter monitor model: ");
        String monitorModel = scanner.nextLine();
        System.out.print("Enter monitor size (inches): ");
        double monitorSize = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        Monitor monitor = new Monitor(monitorModel, monitorSize);

        Computer computer = new Computer(brand, processor, memory, monitor);
        shop.addComputer(computer);
        System.out.println("Computer added successfully!");
    }

    private void removeComputer(Scanner scanner) {
        System.out.print("Enter brand of the computer to remove: ");
        Brand brand = Brand.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        Computer computer = shop.searchComputer(brand);
        if (computer != null) {
            shop.removeComputer(computer);
            System.out.println("Computer removed successfully!");
        } else {
            System.out.println("Computer not found.");
        }
    }

    private void searchComputer(Scanner scanner) {
        System.out.print("Enter brand of the computer to search: ");
        Brand brand = Brand.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        Computer computer = shop.searchComputer(brand);
        if (computer != null) {
            System.out.println("Found: " + computer);
        } else {
            System.out.println("Computer not found.");
        }
    }
}
