package ru.mirea.practice.s0000001.task1.task1.task2;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен: " + computer);
    }

    public void removeComputerByBrand(String brand) {
        computers.removeIf(computer -> computer.getBrand().equalsIgnoreCase(brand));
        System.out.println("Компьютер удален по бренду: " + brand);
    }

    public Computer findComputerByBrand(String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                return computer;
            }
        }
        return null;
    }

    public void printComputers() {
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}