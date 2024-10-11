package ru.mirea.practice.s23L0908.Task10;

public interface Fshop {
    Computer searchComputer(String name, int RAM, int ROM, int hz, int size, String panel, double clockSpeed, int core, int threads);

    void delComputer(String name);

    int addComputer(String name, int RAM, int ROM, int hz, int size, String panel, double clockSpeed, int core, int threads);
}
