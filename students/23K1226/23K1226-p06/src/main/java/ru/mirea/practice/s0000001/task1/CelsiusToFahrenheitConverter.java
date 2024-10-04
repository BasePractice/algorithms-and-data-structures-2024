package ru.mirea.practice.s0000001.task1;

class CelsiusToFahrenheitConverter implements Convertable {
    public double convert(double value) {
        return value * 9 / 5 + 32;
    }
}
