package ru.mirea.practice.s23k0823.task4structurepc;


public class Monitor {
    private int size;
    private String resolution;

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
}
