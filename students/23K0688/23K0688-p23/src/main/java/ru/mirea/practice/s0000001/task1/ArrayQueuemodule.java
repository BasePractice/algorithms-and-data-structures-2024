package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;

public class ArrayQueuemodule {
    private String[] art;

    public void setArr(String[] arr) {
        String[] arrt = new String[arr.length];
        System.arraycopy(arr, 0, arrt, 0, arr.length);
        this.art = arrt;
    }

    public void enqueue(String t) {
        String[] arrt = new String[art.length + 1];
        if (art[art.length - 1] == null) {
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

    public String dequeue() {
        String[] arrt = new String[art.length - 1];
        String el = art[0];
        System.arraycopy(art, 1, arrt, 0,art.length - 1);
        this.art = arrt;
        return el;
    }

    public void print() {
        System.out.println("Start");
        for (String s : art) {
            System.out.println(s);
        }
        System.out.println("End");
    }

    public String getElement() {
        return art[0];
    }

    public void clear() {
        Arrays.fill(art, null);
    }

    public int getSize() {
        return art.length;
    }

    public boolean isEmpty() {
        for (String s : art) {
            if (s == null) {
                return true;
            }
        }
        return false;
    }
}
