package ru.mirea.practice.s23l0908.task10;

public class Memory {
    private final int ram;
    private final int rom;

    public Memory(int ram, int rom) {
        this.ram = ram;
        this.rom = rom;
    }

    public int getRam() {
        return ram;
    }

    @SuppressWarnings("unused")
    public int getRom() {
        return rom;
    }

    @Override
    public String toString() {
        return "Memory{"
            +
            "ram="
            + ram
            +
            ", rom="
            + rom
            +
            '}';
    }
}

