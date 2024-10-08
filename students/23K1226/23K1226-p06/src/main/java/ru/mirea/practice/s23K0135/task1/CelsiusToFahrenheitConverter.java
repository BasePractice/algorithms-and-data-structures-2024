package ru.mirea.practice.s23K0135.task1;

class CelsiusToFahrenheitConverter implements Convertable {
    public double convert(double value) {
        return value * 9 / 5 + 32;
    }
}
