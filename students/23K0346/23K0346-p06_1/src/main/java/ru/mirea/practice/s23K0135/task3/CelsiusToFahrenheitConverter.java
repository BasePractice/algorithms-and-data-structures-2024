package ru.mirea.practice.s23K0135.task3;

public class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature * 9 / 5 + 32;
    }
}

