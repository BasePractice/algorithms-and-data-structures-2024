package ru.mirea.practice.s23k0823.task11;

class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double value) {
        return value * 9 / 5 + 32;
    }
}