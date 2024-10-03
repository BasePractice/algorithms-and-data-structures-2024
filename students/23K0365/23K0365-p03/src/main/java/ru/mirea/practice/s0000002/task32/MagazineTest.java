package ru.mirea.practice.s0000002.task32;

public abstract class MagazineTest {
    public static void main(String[] args) {
        Magazine arr = new Magazine(12.532, 99.999, 1234.5567);
        double finPrice = 0;
        finPrice += arr.addToU();
        arr.convertCurrency(finPrice);
    }
}