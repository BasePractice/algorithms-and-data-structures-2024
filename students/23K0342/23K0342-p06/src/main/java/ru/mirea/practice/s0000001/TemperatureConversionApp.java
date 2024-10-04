package ru.mirea.practice.s0000001;

interface Convertable {
    double convert(double celsius);
}

class TemperatureConverter implements Convertable {

    public double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double convert(double celsius) {
        return convertToKelvin(celsius); // Измените на convertToFahrenheit для конверсии в Фаренгейты
    }
}

public class TemperatureConversionApp {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 25.0; // Пример температуры в Цельсиях

        double kelvin = converter.convertToKelvin(celsius);
        double fahrenheit = converter.convertToFahrenheit(celsius);

        System.out.printf("Температура: %.2f °C = %.2f K = %.2f °F%n", celsius, kelvin, fahrenheit);
    }
}
