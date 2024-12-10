package ru.mirea.practice.s0000001;

public abstract class Tester {
    public static void main(String[] args) {
        List list = new List();
        System.out.println(list.isEmpty());
        for (int i = 0;i < 3;i++) {
            list.addFont();
        }
        System.out.println(list.isEmpty());
        list.printInfo(2);
        list.delEl(2);
        list.clear();
        System.out.println(list.isEmpty());
    }
}
