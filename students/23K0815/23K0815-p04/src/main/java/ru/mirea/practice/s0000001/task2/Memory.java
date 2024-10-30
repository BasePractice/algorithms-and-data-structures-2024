package ru.mirea.practice.s0000001.task2;

public class Memory {
    private final int size; // Size in gigabytes (GB)

    // Constructor to initialize the memory size
    public Memory(int size) {
        this.size = size;
    }

    // Getter method to retrieve the size
    public int getSize() {
        return size;
    }

    // Overriding the toString method for better readability when printing Memory objects
    @Override
    public String toString() {
        return "Memory{"
                +
                "size=" + size
                +
                " GB"
                +
                '}';
    }
}