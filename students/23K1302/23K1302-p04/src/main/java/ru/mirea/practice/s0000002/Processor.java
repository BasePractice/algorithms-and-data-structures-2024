package ru.mirea.practice.s0000002;

class Processor {
    private String model;
    private int cores;
    private double frequency;

    public Processor(String model, int cores, double frequency) {
        this.model = model;
        this.cores = cores;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public int getCores() {
        return cores;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Processor{"
                + "model='" + model + '\''
                + ", cores=" + cores
                + ", frequency=" + frequency + " GHz"
                + '}';
    }
}