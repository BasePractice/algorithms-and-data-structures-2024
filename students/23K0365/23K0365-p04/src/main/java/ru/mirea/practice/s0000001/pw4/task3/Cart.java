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
        Goods[] newArr = new Goods[len + 1];
        for (int i = 0; i < len; i++) {
            newArr[i] = arr[i];
        }
        newArr[len] = newOne;
        ar.price += newOne.viewPrice();
        ar.arr = newArr;
        newOne.minusOne();
        return ar;
    }

    public Goods[] getArr() {
        return arr;
    }

    public void setArr(Goods[] arr) {
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
        for (Goods x : arr) {
            x.print();
        }
        System.out.println("Ur total is " + this.price);
    }

    @Override
    public String toString() {
        return "Cart:" + Arrays.toString(arr)
                + "\nTotal is " + price;
    }
}