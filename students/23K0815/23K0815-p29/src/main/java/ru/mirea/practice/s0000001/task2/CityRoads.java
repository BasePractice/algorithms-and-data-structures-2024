package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

class CityRoads {
    private int[][] adjacencyMatrix;
    private int numberOfCities;

    // Конструктор для инициализации
    public CityRoads(int numberOfCities) {
        this.numberOfCities = numberOfCities;
        this.adjacencyMatrix = new int[numberOfCities][numberOfCities];
    }

    // Метод для заполнения матрицы смежности
    public void fillMatrix(Scanner scanner) {
        System.out.println("Введите матрицу смежности:");
        for (int i = 0; i < numberOfCities; i++) {
            for (int j = 0; j < numberOfCities; j++) {
                while (true) {
                    try {
                        this.adjacencyMatrix[i][j] = scanner.nextInt();
                        if (this.adjacencyMatrix[i][j] != 0 && this.adjacencyMatrix[i][j] != 1) {
                            throw new IllegalArgumentException("Значение должно быть 0 или 1");
                        }
                        break; // Выход из цикла, если ввод корректен
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода. Пожалуйста, введите 0 или 1:");
                        scanner.next(); // Удаляем неверный ввод
                    }
                }
            }
        }
    }

    // Метод для подсчета дорог
    public int countRoads() {
        int roadCount = 0;
        for (int i = 0; i < numberOfCities; i++) {
            for (int j = 0; j < numberOfCities; j++) {
                // Проверяем только выше главной диагонали
                if (j > i && adjacencyMatrix[i][j] == 1) {
                    roadCount++;
                }
            }
        }
        return roadCount;
    }
}