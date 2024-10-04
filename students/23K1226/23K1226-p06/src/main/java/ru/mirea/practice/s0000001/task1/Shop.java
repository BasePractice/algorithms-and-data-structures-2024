package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.List;

class Shop implements Printable {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer searchComputer(String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equals(brand)) { // Используем геттер
                return computer;
            }
        }
        return null;
    }

    public void print() {
        for (Computer computer : computers) {
            System.out.println("Computer: " + computer.getBrand()); // Используем геттер
        }
    }
}
