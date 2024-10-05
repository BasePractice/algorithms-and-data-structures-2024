package ru.mirea.practice.s23L0908.task2;

public class Processor {
    private String model;
    private double speed; // В гигагерцах (GHz)

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
        return "Processor{"
                +
                "model='" + model + '\''
                +
            ", speed=" + speed
                +
                " GHz"
                +
                '}';
    }
}
