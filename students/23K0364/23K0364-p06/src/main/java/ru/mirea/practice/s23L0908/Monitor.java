package ru.mirea.practice.s23L0908;

public class Monitor {
    private String model;
    private double size;

    public Monitor(String model, double size) {
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" + "model='" + model + '\'' + ", size=" + size + " inches" + '}';
    }
}

