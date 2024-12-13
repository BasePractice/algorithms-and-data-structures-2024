package ru.mirea.practice.s0000001.num2;

public class Monitor {
    private String resolution;
    private double size;

    public Monitor(String resolution, double size) {
        this.resolution = resolution;
        this.size = size;
    }

    public String getDetails() {
        return resolution + ", " + size + " inch";
    }
}
