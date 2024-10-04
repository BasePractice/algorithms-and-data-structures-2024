package ru.mirea.practice.s0000006.task11;

public class CelsiusConverter implements Convertable {
    private double celsius;

    public CelsiusConverter(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }

    @Override
    public double convert() {
        // For this example, we can choose to convert to Fahrenheit by default
        return toFahrenheit();
    }

    public void printConversions() {
        System.out.printf("Celsius: %.2f°C\nFahrenheit: %.2f°F\nKelvin: %.2fK\n",
                celsius, toFahrenheit(), toKelvin());
    }
}
