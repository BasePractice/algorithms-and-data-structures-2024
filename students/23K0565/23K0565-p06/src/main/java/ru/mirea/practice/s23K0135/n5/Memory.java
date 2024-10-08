package ru.mirea.practice.s23K0135.n5;

public class Memory {
    private final int size;

    public Memory(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return size + " GB";
    }
}
