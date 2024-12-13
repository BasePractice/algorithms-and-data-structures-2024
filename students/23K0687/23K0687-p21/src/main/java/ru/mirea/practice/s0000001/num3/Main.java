package ru.mirea.practice.s0000001.num3;

public final class Main {
    public static void main(String[] args) {
        Object[] a = {1, 2L, 3.14, "hello"};
        Object e = getElement(a, 2);
        System.out.println("Элемент на индексе 2: " + e);
    }

    public static Object getElement(Object[] a, int idx) {
        return a[idx];
    }

    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }
}
