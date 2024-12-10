package ru.mirea.practice.s0000001.task4;

public class MinMax<T extends Comparable<T>> {
    private T[] nums;

    public MinMax(T[] nums) {
        this.nums = nums;
    }

    public T minElement() {
        if (nums.length != 0) {
            T temp = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i].compareTo(nums[i + 1]) > 0) {
                    temp = nums[i + 1];
                }
            }
            return temp;
        } else {
            return null;
        }
    }

    public T maxElement() {
        T temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i].compareTo(nums[i + 1]) < 0) {
                temp = nums[i + 1];
            }
        }
        return temp;
    }

    public T[] getNums() {
        return nums;
    }

    public void setNums(T[] nums) {
        this.nums = nums;
    }
}
