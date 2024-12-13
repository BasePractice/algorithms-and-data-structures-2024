package ru.mirea.practice.s0000001.n2;

import java.util.ArrayList;
import java.util.List;

public final class ListD {
    private ListD() {
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        CusIterator<Integer> iter = new CusIterator<>(nums);

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
