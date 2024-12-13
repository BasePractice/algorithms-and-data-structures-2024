package ru.mirea.practice.s0000001.num2;

public class Memory {
    private int size;
    private String type;

    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public String getDetails() {
        return size + " GB " + type;
    }
}
