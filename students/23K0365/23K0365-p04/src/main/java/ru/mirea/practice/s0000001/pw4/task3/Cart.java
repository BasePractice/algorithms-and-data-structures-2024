package ru.mirea.practice.s0000001.pw4.task3;

import java.util.Arrays;

public class Cart {
    private String[] arr;
    private int price;

    public Cart(String[] arr, int price) {
        this.arr = arr;
        this.price = price;
    }

    public Cart addSmth(Cart ar, Goods newOne) {
        String[] arr = ar.arr;
        int len = arr.length;
        String[] newArr = new String[len + 1];
        for (int i = 0; i < len; i++) {
            newArr[i] = arr[i];
        }
        newArr[len] = newOne.name();
        ar.price += newOne.viewPrice();
        ar.arr = newArr;
        newOne.minusOne();
        return ar;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void finishShopping() {
        System.out.println();
        for (String x : arr) {
            Goods.valueOf(x).print();
        }
        System.out.println("Ur total is " + this.price);
    }

    @Override
    public String toString() {
        return "Cart:" + Arrays.toString(arr)
                + "\nTotal is " + price;
    }
}