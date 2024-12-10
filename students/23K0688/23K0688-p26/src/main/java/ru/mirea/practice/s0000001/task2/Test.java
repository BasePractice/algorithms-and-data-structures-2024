package ru.mirea.practice.s0000001.task2;

import java.util.Iterator;

public abstract class Test {
    public static void main(String[] args) {
        List<String> list = new Lister<>();
        list.add("10");
        list.add("ok");
        list.add("la");
        list.add("ko");
        System.out.println("Start:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("End;");
    }
}
