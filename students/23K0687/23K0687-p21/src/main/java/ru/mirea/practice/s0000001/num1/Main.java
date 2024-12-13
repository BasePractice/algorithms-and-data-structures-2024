package ru.mirea.practice.s0000001.num1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Main {
    public static void main(String[] args) {
        Object[] a = {1, "hello", 2, "world"};
        List<Object> l = toList(a);
        System.out.println("Конвертированный список: " + l);
    }

    public static List<Object> toList(Object[] a) {
        List<Object> r = new ArrayList<>();
        Collections.addAll(r, a);
        return r;
    }

    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }
}

