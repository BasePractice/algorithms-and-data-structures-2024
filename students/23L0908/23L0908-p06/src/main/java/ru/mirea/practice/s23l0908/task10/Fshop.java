package ru.mirea.practice.s23l0908.task10;

@SuppressWarnings("unused")
public interface Fshop {
    Computer searchComputer(String name, int ram, int rom, int hz, int size, String panel, double clockSpeed, int core, int threads);

    @SuppressWarnings("unused")
    void delComputer(String name);

    int addComputer(String name, int ram, int rom, int hz, int size, String panel, double clockSpeed, int core, int threads);
}
