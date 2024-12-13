package ru.mirea.practice.s0000001.n3;

public final class ListDemo {
    private ListDemo() {
    }

    public static void main(String[] args) {
        CusList<Integer> nums = new CusList<>(5);
        nums.add(10);
        nums.add(20);
        nums.add(30);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
//Upd
