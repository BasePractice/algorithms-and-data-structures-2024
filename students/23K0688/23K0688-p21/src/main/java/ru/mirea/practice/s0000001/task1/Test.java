package ru.mirea.practice.s0000001.task1;

public abstract class Test {
    public static void main(String[] args) {
        String[] starr = {"ok,ko"};
        int[] intarr = {1,2,0};
        Converter c = new Converter();
        System.out.println(c.starrtolist(starr));
        System.out.println(c.intarrtolist(intarr));
    }
}
