package ru.mirea.practice.s0000001;

public class Processor {
    private String model;
    private double speed;

    public Processor(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Processor: " + model + ", Speed: " + speed + " GHz";
    }
}

