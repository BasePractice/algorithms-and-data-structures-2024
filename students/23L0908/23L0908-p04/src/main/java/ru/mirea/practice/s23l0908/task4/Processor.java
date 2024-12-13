package ru.mirea.practice.s23l0908.task4;

public class Processor {
    private final String model;
    private final int cores;
    private final double speed;

    public Processor(String model, int cores, double speed) {
        this.model = model;
        this.cores = cores;
        this.speed = speed;
    }

    @SuppressWarnings("unused")
    public String getModel() {
        return model;
    }

    @SuppressWarnings("unused")
    public int getCores() {
        return cores;
    }

    @SuppressWarnings("unused")
    public double getSpeed() {
        return speed;
    }
}
