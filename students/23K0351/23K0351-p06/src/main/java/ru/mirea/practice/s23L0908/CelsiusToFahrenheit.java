package ru.mirea.practice.s23L0908;

class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature * 9 / 5 + 32;
    }
}
