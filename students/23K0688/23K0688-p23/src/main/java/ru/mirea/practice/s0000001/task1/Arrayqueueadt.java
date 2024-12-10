package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;

public class Arrayqueueadt<T> {
    private T[] art;

    public void setArr(T[] arr) {
        T[] arrt = (T[]) new Object[arr.length];
        System.arraycopy(arr, 0, arrt, 0, arr.length);
        this.art = arrt;
    }

    public void enqueue(T t) {
        T[] arrt = (T[]) new Object[art.length + 1];
        if (art[art.length - 1] != null) {
            System.arraycopy(art, 0, arrt, 0,art.length);
            arrt[arrt.length - 1] = t;
        } else {
            for (int i = 0;i < art.length;i++) {
                if (art[i] == null) {
                    art[i] = t;
                    break;
                } else {
                    System.out.println("out of space");
                }
            }
        }
        this.art = arrt;
    }

    public T dequeue() {
        T[] arrt = (T[]) new Object[art.length - 1];
        T el = art[0];
        System.arraycopy(art, 1, arrt, 0,art.length - 1);
        this.art = arrt;
        return el;
    }

    public void print() {
        System.out.println("Start");
        for (T t : art) {
            System.out.println(t);
        }
        System.out.println("End");
    }

    public T getElement() {
        return art[0];
    }

    public void clear() {
        Arrays.fill(art, null);
    }

    public int getSize() {
        return art.length;
    }

    public boolean isEmpty() {
        for (T t : art) {
            if (t == null) {
                return true;
            }
        }
        return false;
    }



}
