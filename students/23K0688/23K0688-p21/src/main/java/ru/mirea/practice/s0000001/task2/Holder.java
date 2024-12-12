package ru.mirea.practice.s0000001.task2;

public class Holder<D> {
    private int size;
    private D[] arr;

    public Holder(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public D[] getArr() {
        return arr;
    }

    public void setArr(D[] arr) {
        D[] arrt = (D[]) new Object[size];
        System.arraycopy(arr, 0, arrt, 0, size);
        this.arr = arrt;
    }

    public void print() {
        for (int i = 0;i < size;i++) {
            System.out.println(arr[i]);
        }
    }

}
