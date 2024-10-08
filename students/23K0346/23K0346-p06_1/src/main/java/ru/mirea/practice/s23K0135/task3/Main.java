package ru.mirea.practice.s23K0135.task3;

public abstract class Main {
    public static void main(String[] args) {
        double celsiusTemperature = 25.0; // пример температуры по Цельсию

        Convertable toKelvinConverter = new CelsiusToKelvinConverter();
        Convertable toFahrenheitConverter = new CelsiusToFahrenheitConverter();

        double kelvinTemperature = toKelvinConverter.convert(celsiusTemperature);
        double fahrenheitTemperature = toFahrenheitConverter.convert(celsiusTemperature);

        System.out.println(celsiusTemperature + " °C = " + kelvinTemperature + " K");
        System.out.println(celsiusTemperature + " °C = " + fahrenheitTemperature + " °F");
    }
}
