package ru.mirea.practice.s23K0135.task5and6;

public abstract class Tester {
    public static void main(String[] args) {
        ProcessString a = new ProcessStringOpp();
        String q = "qwer asdf zxcv";
        System.out.println(a.countOfElements(q));
        System.out.println(a.invertedString(q));
        System.out.println(a.notOddString(q));
    }
}
