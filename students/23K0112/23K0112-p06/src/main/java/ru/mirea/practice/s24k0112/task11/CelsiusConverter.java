package ru.mirea.practice.s24k0112.task11;

public class CelsiusConverter implements Convertable {
    int temperature;

    public CelsiusConverter(int temperature) {
        this.temperature = temperature;
    }

    public String convert() {
        double fahrenheit = 1.8 * temperature + 32;
        int kelvin = temperature + 273;
        return "Celsius: " + temperature + "\nFahrenheit: " + fahrenheit + "\nKelvin: " + kelvin + '\n';
    }
}
