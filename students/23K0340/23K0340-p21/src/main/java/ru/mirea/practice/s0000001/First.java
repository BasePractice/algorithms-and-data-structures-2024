package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class First {
    public static void main(String[] args) {
        String[] s = new String[5];
        s[0] = "a";
        s[1] = "b";
        s[2] = "c";
        s[3] = "d";
        s[4] = "e";
        List<String> s1 = new LinkedList<>();
        s1 = arraytolst(s);
        System.out.println(s1.get(0));
    }

    public static <T> List<T> arraytolst(T[] arr) {
        int len = arr.length;
        ArrayList<T> lst = new ArrayList<>();
        for (int i = 0;i < len;i++) {
            lst.add(arr[i]);
        }
        return (List<T>) lst;
    }
}
