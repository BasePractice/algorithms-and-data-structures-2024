package ru.mirea.practice.s0000001

public interface ShopInterface {
    void addComputer(Computer computer);
    void removeComputer(String model);
    Computer findComputer(String model);
}

