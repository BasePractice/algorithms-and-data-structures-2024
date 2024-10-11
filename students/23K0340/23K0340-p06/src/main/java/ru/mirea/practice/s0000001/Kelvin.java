package ru.mirea.practice.s0000001;

public class Kelvin implements Convertable {
    private double tempK;

    public Kelvin(double temp) {
        this.tempK = temp;
    }

    public double getTempK() {
        return tempK;
    }

    @Override
    public void convert(double temp) {
        this.tempK = temp + 273;
    }
}
