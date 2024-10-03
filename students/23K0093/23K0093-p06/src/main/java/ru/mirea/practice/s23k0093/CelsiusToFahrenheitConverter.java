package ru.mirea.practice.s23k0093;

class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature * 1.8 + 32;
    }
}