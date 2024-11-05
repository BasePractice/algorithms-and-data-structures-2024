package ru.mirea.practice.s0000006.task11;

public class CelsiusConverter implements Convertable {
    private double celsius;

    public CelsiusConverter(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;  // удалены лишние скобки
    }

    public double toKelvin() {
        return celsius + 273.15;
    }

    @Override
    public double convert() {
        return toFahrenheit();
    }

    public void printConversions() {
        System.out.printf("Celsius: %.2f°C\nFahrenheit: %.2f°F\nKelvin: %.2fK\n",
                celsius, toFahrenheit(), toKelvin());
    }
}
