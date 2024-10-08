package ru.mirea.practice.s23K0135;

public class Memory {
    private String type;
    private int size;

    public Memory(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Memory: " + size + " GB, Type: " + type;
    }
}

