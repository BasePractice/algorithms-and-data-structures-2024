package ru.mirea.practice.s23f0011.task11;

class CelsiusToKelvin implements Convertable {
    private final double celsius;

    public CelsiusToKelvin(double celsius) {
        this.celsius = celsius;
    }

    public double convert() {
        return celsius + 273.15;
    }
}