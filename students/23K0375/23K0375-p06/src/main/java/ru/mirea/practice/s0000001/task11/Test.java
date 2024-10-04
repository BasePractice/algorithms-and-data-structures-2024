package ru.mirea.practice.s0000001.task11;

public abstract class Test {
    public static void main(String[] args) {
        double celsius = 27.0; // Пример температуры в градусах Цельсия

        // Конвертация в Кельвины
        Convertable kelvinConverter = new KelvCon();
        double kelvin = kelvinConverter.convert(celsius);
        System.out.println(celsius + " градусов Цельсия = " + kelvin + " Кельвинов");

        // Конвертация в Фаренгейты
        Convertable fahrenheitConverter = new FahrCon();
        double fahrenheit = fahrenheitConverter.convert(celsius);
        System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " Фаренгейтов");
    }
}
