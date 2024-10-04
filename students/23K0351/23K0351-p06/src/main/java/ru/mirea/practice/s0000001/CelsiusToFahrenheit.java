package ru.mirea.practice.s0000001;

class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature * 9 / 5 + 32;
    }
}