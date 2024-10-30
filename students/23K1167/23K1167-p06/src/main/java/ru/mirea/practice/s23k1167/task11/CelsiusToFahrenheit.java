package ru.mirea.practice.s23k1167.task11;

class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double value) {
        return value * 9 / 5 + 32;
    }
}