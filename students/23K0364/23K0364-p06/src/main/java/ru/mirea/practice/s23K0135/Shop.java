package ru.mirea.practice.s23K0135;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer searchComputer(Brand brand) {
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                return computer;
            }
        }
        return null;  // Если компьютер не найден
    }

    public void displayComputers() {
        if (computers.isEmpty()) {
            System.out.println("No computers available.");
        } else {
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
    }
}

