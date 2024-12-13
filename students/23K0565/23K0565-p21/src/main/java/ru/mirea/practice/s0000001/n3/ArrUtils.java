package ru.mirea.practice.s0000001.n3;

public class ArrUtils<T> {
    public T getByIdx(T[] arr, int idx) {
        if (idx < 0 || idx >= arr.length) {
            throw new RuntimeException("Индекс вне диапазона");
        }
        return arr[idx];
    }

    public static void main(String[] args) {
        ArrUtils<Integer> intUtils = new ArrUtils<>();
        ArrUtils<String> strUtils = new ArrUtils<>();

        Integer[] intArr = {10, 20, 30, 40};
        String[] strArr = {"apple", "banana", "cherry"};

        System.out.println(intUtils.getByIdx(intArr, 2)); //вывод 30
        System.out.println(strUtils.getByIdx(strArr, 1)); //вывод banana
    }
}
