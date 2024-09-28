package ru.mirea.practice.s0000001.pw4.task3;

import java.util.Arrays;

public class Cart {
    private Goods[] arr;
    private int price;

    public Cart(Goods[] arr, int price) {
        this.arr = arr;
        this.price = price;
    }

    public Cart addSmth(Cart ar, Goods newOne) {
        Goods[] arr = ar.arr;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            newArr[i] = arr[i];
        }
        newArr[len] = newOne;
        ar.price += newOne.viewPrice();
        ar.arr = newArr;
        newOne.minusOne();
        return ar;
    }

        return arr;
    }

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
    }
}