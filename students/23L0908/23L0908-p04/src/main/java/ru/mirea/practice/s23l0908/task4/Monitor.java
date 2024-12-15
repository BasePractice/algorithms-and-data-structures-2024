package ru.mirea.practice.s23l0908.task4;

public class Monitor {
    private final String resolution;
    private final double size;

    public Monitor(String resolution, double size) {
        this.resolution = resolution;
        this.size = size;
    }

    @SuppressWarnings("unused")
    public String getResolution() {
        return resolution;
    }

    @SuppressWarnings("unused")
    public double getSize() {
        return size;
    }
}
