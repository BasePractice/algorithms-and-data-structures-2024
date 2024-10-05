package ru.mirea.practice.s23L0908;

public class Farengate implements Convertable {
    private double temp;

    public Farengate(double tempF) {
        this.temp = tempF;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public void convert(double temp) {
        this.temp = temp * 1.8 + 32;
    }
}
