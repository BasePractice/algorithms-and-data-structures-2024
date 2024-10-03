package ru.mirea.practice.s23k0164.t4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers;

    public Shop() {
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public List<Computer> searchComputers(String criteria) {
        List<Computer> result = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.matches(criteria)) {
                result.add(computer);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Магазин [компьютеры=" + computers + "]";
    }
}