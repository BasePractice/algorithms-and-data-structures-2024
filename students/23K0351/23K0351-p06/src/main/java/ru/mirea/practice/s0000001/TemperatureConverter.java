package ru.mirea.practice.s0000001;

public abstract class TemperatureConverter {
    public static void main(String[] args) {
        Convertable toKelvin = new CelsiusToKelvin();
        Convertable toFahrenheit = new CelsiusToFahrenheit();

        double celsiusTemperature = 25;

        System.out.println("Temperature in Celsius: " + celsiusTemperature);
        System.out.println("Converted to Kelvin: " + toKelvin.convert(celsiusTemperature));
        System.out.println("Converted to Fahrenheit: " + toFahrenheit.convert(celsiusTemperature));
    }
}