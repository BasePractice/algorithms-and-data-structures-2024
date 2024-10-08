package ru.mirea.practice.s23K0135;

class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature * 9 / 5 + 32;
    }
}
