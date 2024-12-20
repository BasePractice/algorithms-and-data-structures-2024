package ru.mirea.practice.s0000001.num2;

public class MyArray {
    private Object[] arr;

    public MyArray(Object[] arr) {
        this.arr = arr;
    }

    public void printArray() {
        System.out.print("Массив: ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
    }
}
