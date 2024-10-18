package ru.mirea.practice.s23l0908.Task4;

public class Processor {
    private String model;
    private int cores;
    private double speed;

    public Processor(String model, int cores, double speed) {
        this.model = model;
        this.cores = cores;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getCores() {
        return cores;
    }

    public double getSpeed() {
        return speed;
    }
}
