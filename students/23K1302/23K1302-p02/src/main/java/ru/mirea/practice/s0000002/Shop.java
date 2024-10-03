package ru.mirea.practice.s0000002;

import java.util.ArrayList;
import java.util.List;


class Shop {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Успешно добавлен: " + computer);
    }

    public void removeComputer(String name) {
        boolean exists = computers.stream().anyMatch(computer -> computer.getName().equals(name));

        if (exists) {
            computers.removeIf(computer -> computer.getName().equals(name));
            System.out.println("Успешно удалён: " + name);
        } else {
            System.out.println("Компьютер не найден: " + name);
        }
    }



    public void displayComputers() {
        if (computers.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Список компьютеров");
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
    }
}
