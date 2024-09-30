package ru.mirea.practice.s23k0362.pw4.task3;

import java.util.Arrays;

public class Cart {
    private ViewList[] arr;
    private int price;

    public Cart(ViewList[] arr, int price) {
        this.arr = arr;
        this.price = price;
    }

    public Cart addSmth(Cart ar, ViewList newOne) {
        ViewList[] arr = ar.arr;
        int len = arr.length;
        ViewList[] newArr = new ViewList[len + 1];
        for (int i = 0; i < len; i++) {
            newArr[i] = arr[i];
        }
        newArr[len] = newOne;
        ar.price += newOne.viewPrice();
        ar.arr = newArr;
        newOne.minusOne();
        return ar;
    }

    public ViewList[] getArr() {
        return arr;
    }

    public void setArr(ViewList[] arr) {
        this.arr = arr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart:" + Arrays.toString(arr) +
                "\nTotal is " + price;
    }
}