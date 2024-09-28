package ru.mirea.practice.s0000001.task32;

public abstract class MagazineTest {
    public static void main(String[] args) {
        Magazine arr = new Magazine(12.532, 99.999, 1234.5567);
        int finPrice = 0;
        finPrice += arr.addToU(arr);
        arr.convertCurrency(finPrice);
    }
}