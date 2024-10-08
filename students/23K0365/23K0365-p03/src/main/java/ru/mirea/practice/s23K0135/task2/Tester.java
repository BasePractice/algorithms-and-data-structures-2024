package ru.mirea.practice.s23K0135.task2;

import java.util.Arrays;

public class Tester {
    private Circle[] arr;
    private int amountOf;

    public Tester(Circle[] arr, int amountOf) {
        this.arr = arr;
        this.amountOf = amountOf;
    }

    public Circle[] getArr() {
        return arr;
    }

    public void setArr(Circle[] arr) {
        this.arr = arr;
    }

    public int getAmountOf() {
        return amountOf;
    }

    public void setAmountOf(int amountOf) {
        this.amountOf = amountOf;
    }

    public Circle findSmaller(Tester mas) {
        double min = mas.arr[0].getRadius();
        Circle minCir = mas.arr[0];
        for (int i = 0; i < mas.amountOf; i++) {
            if (mas.arr[i].getRadius() < min) {
                minCir = mas.arr[i];
                min = mas.arr[0].getRadius();
            }
        }
        return minCir;
    }

    public Circle findBigger(Tester mas) {
        double big = mas.arr[0].getRadius();
        Circle bigCir = mas.arr[0];
        for (int i = 0; i < mas.amountOf; i++) {
            if (mas.arr[i].getRadius() > big) {
                bigCir = mas.arr[i];
                big = mas.arr[0].getRadius();
            }
        }
        return bigCir;
    }

    public Tester sortByRadius(Tester mas) {
        boolean isSorted = false;
        Circle temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < this.amountOf - 1; i++) {
                if (mas.arr[i].getRadius() > mas.arr[i + 1].getRadius()) {
                    isSorted = false;
                    temp = mas.arr[i];
                    mas.arr[i] = mas.arr[i + 1];
                    mas.arr[i + 1] = temp;
                }
            }
        }
        return mas;
    }

    @Override
    public String toString() {
        return "Array is: " + Arrays.toString(arr)
                + "; amount of circles:" + amountOf;
    }
}
