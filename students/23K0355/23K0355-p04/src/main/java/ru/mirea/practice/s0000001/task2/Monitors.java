package ru.mirea.practice.s0000001.task2;

public class Monitors {
    private String resolution;
    private double size;

    public Monitors(String resolution, double size) {
        this.resolution = resolution;
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public double getSize() {
        return size;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{"
                + "resolution='" + resolution + '\''
                + ", size=" + size
                + '}';
    }
}