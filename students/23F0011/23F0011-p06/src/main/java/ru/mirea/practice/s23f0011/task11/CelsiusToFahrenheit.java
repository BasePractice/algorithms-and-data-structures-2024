package ru.mirea.practice.s23f0011.task11;

class CelsiusToFahrenheit implements Convertable {
    private final double celsius;

    public CelsiusToFahrenheit(double celsius) {
        this.celsius = celsius;
    }

    public double convert() {
        return celsius * 9 / 5 + 32;
    }
}