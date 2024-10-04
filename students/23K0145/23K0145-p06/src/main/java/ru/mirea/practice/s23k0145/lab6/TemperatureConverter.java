package ru.mirea.practice.s23k0145.lab6;

public class TemperatureConverter implements Convertable {
    private double celsius;

    // Конструктор
    public TemperatureConverter(double celsius) {
        this.celsius = celsius;
    }

    // Конвертация в Кельвины
    public double toKelvin() {
        return celsius + 273.15;
    }

    // Конвертация в Фаренгейт
    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    // Реализация метода convert из интерфейса
    @Override
    public double convert() {
        return toKelvin(); // Можно настроить, чтобы возвращал разные значения
    }

    // Метод для получения всех значений
    public void printConversions() {
        System.out.printf("Температура: %.2f °C = %.2f K\n", celsius, toKelvin());
        System.out.printf("Температура: %.2f °C = %.2f °F\n", celsius, toFahrenheit());
    }
}
