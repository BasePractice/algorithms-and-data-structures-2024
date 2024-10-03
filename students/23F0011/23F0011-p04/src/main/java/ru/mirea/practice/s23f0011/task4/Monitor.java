package ru.mirea.practice.s23f0011.task4;

public class Monitor {
    private final int size;
    private final String resolution;

    public Monitor(int size, String resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    public int getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }

    public String toString() {
        return "Monitor{size=" + size + ", resolution=" + resolution + "}";
    }
}
