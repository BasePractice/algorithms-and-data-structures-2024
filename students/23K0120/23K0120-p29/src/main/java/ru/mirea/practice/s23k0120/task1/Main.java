package ru.mirea.practice.s23k0120.task1;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public abstract class Main {
    public static void main(String[] args) {
        int n;
        String input;
        int roadCount = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                input = scanner.nextLine();
                List<Integer> list = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
                for (int j = i + 1; j < n; j++) {
                    roadCount += list.get(j);
                }
            }
        }
        System.out.println(roadCount);
    }
}
