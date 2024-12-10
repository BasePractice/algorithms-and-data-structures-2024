package ru.mirea.practice.s0000001.task2;

public abstract class Test {
    public static void main(String[] args) {
        Holder<Integer> hint = new Holder<>(2);
        Integer[] intarr = {1,2};
        hint.setArr(intarr);
        System.out.println("hint:");
        hint.print();
        String[] starr = {"ok","ko"};
        Holder<String> hstr = new Holder<>(2);
        hstr.setArr(starr);
        System.out.println("hstr:");
        hstr.print();
        Holder<Double> hdob = new Holder<>(2);
        Double[] dobarr = {1.0,2.0};
        hdob.setArr(dobarr);
        System.out.println("hdob:");
        hdob.print();

    }
}
