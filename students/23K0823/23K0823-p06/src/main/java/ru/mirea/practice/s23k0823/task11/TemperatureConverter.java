package ru.mirea.practice.s23k0823.task11;

public abstract class TemperatureConverter {
    public static void main(String[] args) {
        Convertable celsiusToKelvin = new CelsiusToKelvin();
        Convertable celsiusToFahrenheit = new CelsiusToFahrenheit();

        double celsius = 30;

        double kelvin = celsiusToKelvin.convert(celsius);
        double fahrenheit = celsiusToFahrenheit.convert(celsius);

        System.out.println(celsius + " градусов Цельсия равно " + kelvin + " градусов Кельвина");
        System.out.println(celsius + " градусов Цельсия равно " + fahrenheit + " градусов Фаренгейта");
    }
}