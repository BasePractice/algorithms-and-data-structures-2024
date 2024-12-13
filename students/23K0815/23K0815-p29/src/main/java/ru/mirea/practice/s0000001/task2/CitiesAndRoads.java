package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

public abstract class CitiesAndRoads {
    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество городов (n): ");
            int numCities = scanner.nextInt();

            // Проверка на допустимое значение numCities
            if (numCities < 0 || numCities > 100) {
                System.out.println("Количество городов должно быть в диапазоне от 0 до 100.");
                return;
            }

            // Создание объекта CityRoads
            CityRoads cityRoads = new CityRoads(numCities);
            cityRoads.fillMatrix(scanner);

            // Подсчет и вывод количества дорог
            int totalRoads = cityRoads.countRoads();
            System.out.println("Количество дорог на планете 'Neptune': " + totalRoads);
        } // Scanner автоматически закрывается здесь
    }
}