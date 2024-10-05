package ru.mirea.practice.s23L0908.prog10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private final List<Computer> computers = new ArrayList<>();

    // Добавление компьютера
    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен.");
    }

    // Удаление компьютера
    public void removeComputer(Computer computer) {
        if (computers.remove(computer)) {
            System.out.println("Компьютер удален.");
        } else {
            System.out.println("Компьютер не найден в магазине.");
        }
    }

    // Поиск конкретного компьютера
    public void findcertainComputer(Computer computer) {
        if (computers.contains(computer)) {
            System.out.println("Компьютер найден:");
            computer.printInfo();
        } else {
            System.out.println("Компьютер не найден в магазине.");
        }
    }

    // Поиск компьютера по марке
    public void findComputer(ComputerBrand brand) {
        if (computers.isEmpty()) {
            System.out.println("В магазине нет компьютеров.");
            return;
        }

        boolean found = false;
        System.out.println("Компьютеры марки " + brand.getBrand() + ":");
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                computer.printInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Компьютеры этой марки не найдены в магазине.");
        }
    }

    public Computer inputComputerData(Scanner scanner) {
        System.out.println("Введите марку компьютера (Apple, DELL, HP, LENOVO, ASUS, ACER, MSI, SAMSUNG, LG, OTHER):");
        String brandName = scanner.nextLine();
        final ComputerBrand brand = ComputerBrand.valueOf(brandName);

        System.out.println("Введите модель процессора:");
        final String model = scanner.nextLine();
        System.out.println("Введите количество ядер процессора:");
        final int cores = scanner.nextInt();
        scanner.nextLine(); // считываем символ перехода строки

        System.out.println("Введите название");
        final String memoryName = scanner.nextLine();
        System.out.println("Введите объем оперативной памяти (GB):");
        final int memorySize = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите название монитора:");
        final String monitorName = scanner.nextLine();
        System.out.println("Введите размер монитора (inches):");
        final String monitorSize = scanner.nextLine();

        Processor processor = new Processor(model, cores);
        Memory memory = new Memory(memoryName, memorySize);
        Monitor monitor = new Monitor(monitorName, monitorSize);

        return new Computer(brand, processor, memory, monitor);
    }
}
