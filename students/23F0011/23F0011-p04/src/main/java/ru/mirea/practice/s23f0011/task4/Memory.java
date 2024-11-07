package ru.mirea.practice.s23f0011.task4;

public class Memory {
    private final int size;
    private final String type;

    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Memory{" + "size=" + size + ", type=" + type + "}";
    }
}
