package ru.mirea.practice.s0000001.task10;

public abstract class TesterOfShop {
    public static void main(String[] args) {
        Computer a = new Computer();
        a.createComp();
        System.out.println();
        Computer[] arr = {a};
        Shop test = new Shop(arr);
        test.toString();
        System.out.println();
        System.out.println();
        test.findUr(Brands.ASUS, 15).toString();
        System.out.println();
        test.toString();
    }
}
