package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.List;

public final class Ex1 {

    private Ex1() {
        // Тут нечего искать
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> sequence = new ArrayList<>();
        generateSequence(n, sequence);
        System.out.println(sequence);
    }

    public static void generateSequence(int n, List<Integer> sequence) {
        for (int i = 1; sequence.size() < n; i++) {
            addNumbers(i, i, sequence, n);
        }
    }

    public static void addNumbers(int number, int count, List<Integer> sequence, int n) {
        if (count == 0 || sequence.size() >= n) {
            return;
        }
        sequence.add(number);
        addNumbers(number, count - 1, sequence, n);
    }
}
