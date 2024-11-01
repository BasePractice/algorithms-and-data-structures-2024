package ru.mirea.practice.s0000001.n5;

public class Processor {
    private final String model;
    private final double frequency;

    public Processor(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return model + " (" + frequency + " GHz)";
    }
}