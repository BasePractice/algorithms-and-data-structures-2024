package ru.mirea.practice.s23k0164.t11;

public final class TemperatureConverter {

    private TemperatureConverter() {

    }

    public static void main(String[] args) {
        double celsius = 23;

        Convertable celsiusToKelvin = new CelsiusToKelvinConverter();
        double kelvin = celsiusToKelvin.convert(celsius);
        System.out.println(celsius + "C = " + kelvin + "K");

        Convertable celsiusToFahrenheit = new CelsiusToFahrenheitConverter();
        double fahrenheit = celsiusToFahrenheit.convert(celsius);
        System.out.println(celsius + "C = " + fahrenheit + "F");
    }
}