package ru.mirea.practice.s0000004.task4;

public class Monitor {
    private String resolution;
    private double size;

    public Monitor(String resolution, double size) {
        this.resolution = resolution;
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Монитор: " + resolution + ", Диагональ: " + size + " дюймов";
    }
}
