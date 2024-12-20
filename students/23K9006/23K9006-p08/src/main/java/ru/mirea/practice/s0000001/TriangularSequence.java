package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class TriangularSequence {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();

            List<Integer> sequence = generateTriangularSequence(n);

            for (int number : sequence) {
                System.out.print(number + " ");
            }
        }
    }

    public static List<Integer> generateTriangularSequence(int n) {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i = 1; count < n; i++) {
            for (int j = 0; j < i && count < n; j++) {
                result.add(i);
                count++;
            }
        }
        return result;
    }
}
