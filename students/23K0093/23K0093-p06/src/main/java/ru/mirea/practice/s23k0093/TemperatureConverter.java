package ru.mirea.practice.s23k0093;

public abstract class TemperatureConverter {
    public static void main(String[] args) {
        double celsiusTemperature = 25.0;

        Convertable kelvinConverter = new CelsiusToKelvinConverter();
        Convertable fahrenheitConverter = new CelsiusToFahrenheitConverter();

        double kelvin = kelvinConverter.convert(celsiusTemperature);
        double fahrenheit = fahrenheitConverter.convert(celsiusTemperature);

        System.out.println(celsiusTemperature + "°C = " + kelvin + " K");
        System.out.println(celsiusTemperature + "°C = " + fahrenheit + " °F");
    }
}