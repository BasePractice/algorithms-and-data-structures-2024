package ru.mirea.practice.s0000001.prog4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Main {
    public static List<Object> getDirectoryContents(String directorypath) {
        File directory = new File(directorypath);
        List<Object> contents = new ArrayList<>();

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                contents.addAll(Arrays.asList(files));
            }
        } else {
            System.out.println("Указанный путь ошибочен");
            throw new IllegalStateException("Invalid");
        }

        return contents;
    }

    public static void print(AllType<Object> list) {
        System.out.println("Первые 5 элементов содержимого каталога:");
        for (int i = 0; i < Math.min(5, list.getLength()); i++) {
            System.out.println((i + 1) + ". " + list.getElement(i));
        }
    }

    public static void main(String[] args) {
        String path = "Path";
        try {
            List<Object> content = getDirectoryContents(path);

            AllType<Object> directoryContents = new AllType<>(content.toArray());
            print(directoryContents);
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
