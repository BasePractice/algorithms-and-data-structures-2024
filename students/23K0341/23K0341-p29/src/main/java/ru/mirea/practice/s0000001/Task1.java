package ru.mirea.practice.s0000001;

import java.util.Scanner;

/**
 * В галактике "Milky Way" на планете "Neptune" есть N городов, некоторые
 * из которых соединены дорогами. Император "Maximus" галактики "Milky
 * Way" решил провести инвентаризацию дорог на планете "Neptune". Но,
 * как оказалось, он не силен в математике, поэтому он просит вас сосчитать
 * количество дорог.
 * <br>
 * Входные данные
 * <br>
 * В первой строке задается число N (0 ≤ N ≤ 100). В следующих N строках
 * содержится по N чисел, каждое из которых является единичкой или
 * ноликом. Причем, если в позиции (i,j) квадратной матрицы стоит
 * единичка, то i-ый и j-ый города соединены дорогами, а если нолик, то не
 * соединены.
 * <br>
 * Выходные данные
 * <br>
 * Выведите одно число – количество дорог на планете "Neptune".
 */

public abstract class Task1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = Integer.parseInt(sc.nextLine());
            Integer[][] data = new Integer[n][n];
            for (int i = 0; i < n; i++) {
                String[] line = sc.nextLine().split(" ");
                for (int j = 0; j < n; j++) {
                    data[i][j] = Integer.parseInt(line[j]);
                }
            }

            int roads = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    roads += data[i][j];
                }
            }

            System.out.println("Количество дорог: " + roads);
        }
    }
}
