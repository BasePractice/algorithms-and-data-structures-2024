package ru.mirea.practice.pr8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Triangular {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int number = input.nextInt();

            List<Integer> pattern = generateTrianglePattern(number);

            for (int num : pattern) {
                System.out.print(num + " ");
            }
        }
    }

    public static List<Integer> generateTrianglePattern(int number) {
        List<Integer> resultList = new ArrayList<>();
        int totalCount = 0;
        for (int i = 1; totalCount < number; i++) {
            for (int j = 0; j < i && totalCount < number; j++) {
                resultList.add(i);
                totalCount++;
            }
        }
        return resultList;
    }
}
