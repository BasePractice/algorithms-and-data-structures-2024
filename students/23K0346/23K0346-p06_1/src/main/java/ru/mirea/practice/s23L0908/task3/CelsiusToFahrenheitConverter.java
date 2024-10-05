package ru.mirea.practice.s23L0908.task3;

public class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature * 9 / 5 + 32;
    }
}

