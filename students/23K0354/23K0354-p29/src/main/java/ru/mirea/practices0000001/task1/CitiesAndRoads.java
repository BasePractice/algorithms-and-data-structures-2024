package ru.mirea.practices0000001.task1;

import java.util.Scanner;

public abstract class CitiesAndRoads {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество городов (n): ");
            int numCities = scanner.nextInt();

            if (numCities < 0 || numCities > 100) {
                System.out.println("Количество городов должно быть в диапазоне от 0 до 100.");
                return;
            }

            CityRoads cityRoads = new CityRoads(numCities);
            cityRoads.fillMatrix(scanner);

            int totalRoads = cityRoads.countRoads();
            System.out.println("Количество дорог на планете 'Neptune': " + totalRoads);
        }
    }
}
