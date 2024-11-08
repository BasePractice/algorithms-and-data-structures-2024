package ru.mirea.practice.s0000001.n2;

public final class FamIO {
    private FamIO() {}

    public static void main(String[] args) {
        String[] arr = {"Java(Фам)", "is(Имя)", "fun(Отч)"};

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}
