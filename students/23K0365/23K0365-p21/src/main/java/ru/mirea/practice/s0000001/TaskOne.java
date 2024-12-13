package ru.mirea.practice.s0000001;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TaskOne<T> {
    private final T[] arr;

    public TaskOne(T[] arr) {
        this.arr = arr;
    }

    public List<T> getUrList() {
        return new LinkedList<>(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        String[] strs = {"q","qw","qwe","qwer"};
        Integer[] ints = {1,2,3,4,5};
        TaskOne a = new TaskOne(strs);
        System.out.println(a.getUrList().get(0));
        TaskOne b = new TaskOne(ints);
        System.out.println(b.getUrList().get(0));
    }
}
