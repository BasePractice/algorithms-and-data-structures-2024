package ru.mirea.practice.lab7.stringworking;

public abstract class TestStringWorking {
    public static void main(String[] args) {
        StringWorking stringWorker = new StringOperations();

        String s = "Привет с большого бодуна!";

        System.out.println("Строка: " + s);
        System.out.println("Количество символов: " + stringWorker.countChars(s));

        System.out.println("Нечётные символы: " + stringWorker.getOddChars(s));

        System.out.println("Развёрнутая строка: " + stringWorker.reverseString(s));
    }
}

