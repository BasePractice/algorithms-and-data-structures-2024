package ru.mirea.practice.s23k0623.prog3;

public abstract class Main {
    public static void main(String[] args) {
        AllType<Integer> intAllType = new AllType<>(new Integer[]{1, 2, 3, 4, 5});
        System.out.println("Integer array: " + intAllType);

        AllType<String> stringAllType = new AllType<>(new String[]{"apple", "banana", "cherry"});
        System.out.println("String array: " + stringAllType);
    }
}
