package ru.mirea.practice.s23k0087.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private final List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Scanner sc) {
        Computer computer = new Computer();
        computer.setName(sc);
        computer.setOs(sc);
        computer.setPrice(sc);

        computers.add(computer);
    }

    public void removeComputer(Scanner sc) {
        System.out.print("Введите название компьютера для удаления: ");
        String name = sc.next();
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getName().equals(name)) {
                computers.remove(i);
                System.out.println("Компьютер удален");
                break;
            }
            if (i == computers.size() - 1) {
                System.out.println("Компьютер не найден");
            }
        }
    }

    public void findComputer(Scanner sc) {
        System.out.print("Введите название компьютера для поиска: ");
        String name = sc.next();

        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getName().equals(name)) {
                System.out.println("Компьютер найден");
                System.out.println(computers.get(i).toString());
                break;
            }
            if (i == computers.size() - 1) {
                System.out.println("Компьютер не найден");
            }
        }
    }

    public void printComputers() {
        for (Computer computer : computers) {
            System.out.println(computer.toString());
        }
    }
}