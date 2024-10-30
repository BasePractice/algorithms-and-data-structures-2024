package ru.mirea.practice.s0000001.task2;

public class Processor {
    private String model;
    private double frequency;

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

    public void setModel(String model) {
        this.model = model;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{"
                + "model='" + model + '\''
                + ", frequency=" + frequency
                + '}';
    }
}