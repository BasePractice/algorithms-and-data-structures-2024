package ru.mirea.practice.s23l0908.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        int min = 10;
        int max = 100;

        for (int i = 0; i < 4; ++i) {
            int randomInt = random.nextInt(max - min) + min;
            nums.add(randomInt);
        }

        System.out.println("Nums: " + nums);
        if (isSorted(nums)) {
            System.out.println("Nums already sorted.");
            System.exit(0);
        }
        System.out.println("Nums not sorted.");
    }

    private static boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                return false;
            }
        }
        return true;
    }
}


