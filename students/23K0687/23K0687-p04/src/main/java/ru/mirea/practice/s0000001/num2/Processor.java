package ru.mirea.practice.s0000001.num2;

public class Processor {
    private String model;
    private double speed;

    public Processor(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getDetails() {
        return model + ", " + speed + " GHz";
    }
}
