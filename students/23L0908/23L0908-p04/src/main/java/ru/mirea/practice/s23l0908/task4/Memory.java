package ru.mirea.practice.s23l0908.task4;

public class Memory {
    private final String type;
    private final int size;

    public Memory(String type, int size) {
        this.type = type;
        this.size = size;
    }

    @SuppressWarnings("unused")
    public String getType() {
        return type;
    }

    @SuppressWarnings("unused")
    public int getSize() {
        return size;
    }
}
