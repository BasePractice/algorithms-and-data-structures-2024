package ru.mirea.practice.s23k0145.lab1;

import java.util.Scanner;

public final class RoadInventory {
    private RoadInventory() {

    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int cityCount = input.nextInt();

            if (cityCount == 0) {
                System.out.println(0);
                return;
            }

            int[][] roadMap = new int[cityCount][cityCount];

            for (int row = 0; row < cityCount; row++) {
                for (int col = 0; col < cityCount; col++) {
                    roadMap[row][col] = input.nextInt();
                }
            }

            int totalRoads = countRoads(roadMap, cityCount);

            System.out.println(totalRoads);
        }
    }

    private static int countRoads(int[][] map, int size) {
        int roadCounter = 0;
        for (int row = 0; row < size; row++) {
            for (int col = row + 1; col < size; col++) {
                if (map[row][col] == 1) {
                    roadCounter++;
                }
            }
        }
        return roadCounter;
    }
}
