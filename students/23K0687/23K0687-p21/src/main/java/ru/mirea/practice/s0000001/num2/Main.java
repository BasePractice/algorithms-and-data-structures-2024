package ru.mirea.practice.s0000001.num2;

public final class Main {
    public static void main(String[] args) {
        Object[] a = {1, 2L, 3.14, "hello"};
        MyArray m = new MyArray(a);
        m.printArray();
    }

    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }
}
