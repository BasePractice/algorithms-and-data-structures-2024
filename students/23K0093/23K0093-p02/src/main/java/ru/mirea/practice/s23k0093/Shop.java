package ru.mirea.practice.s23k0093;

import java.util.ArrayList;
import java.util.List;

class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен: " + computer);
    }

    public void removeComputer(String brand, String model) {
        computers.removeIf(computer -> computer.getBrand().equalsIgnoreCase(brand)
                && computer.getModel().equalsIgnoreCase(model));
        System.out.println("Компьютер удалён: " + brand + " " + model);
    }

    public Computer findComputer(String brand, String model) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                return computer;
            }
        }
        return null;
    }

    public void listComputers() {
        if (computers.isEmpty()) {
            System.out.println("Компьютеры не найдены.");
        } else {
            computers.forEach(System.out::println);
        }
    }
}