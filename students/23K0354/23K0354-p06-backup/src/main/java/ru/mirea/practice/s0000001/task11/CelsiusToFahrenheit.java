package ru.mirea.practice.s0000001.task9.task11;

class CelsiusToFahrenheit implements Convertable {
    private static final double FAHRENHEIT_MULTIPLIER = 9.0 / 5.0;
    private static final double FAHRENHEIT_OFFSET = 32.0;

    @Override
    public double convert(double temperature) {
        return temperature * FAHRENHEIT_MULTIPLIER + FAHRENHEIT_OFFSET;
    }
}
