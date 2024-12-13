package ru.mirea.practice.s0000001.num4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class Main {
    public static void main(String[] args) {
        List<String> f = listFiles("путь_к_каталогу");
        System.out.println("Первые 5 элементов:");
        for (int i = 0; i < Math.min(5, f.size()); i++) {
            System.out.println(f.get(i));
        }
    }

    public static List<String> listFiles(String path) {
        File dir = new File(path);
        List<String> files = new ArrayList<>();
        if (dir.isDirectory()) {
            File[] fileList = dir.listFiles();
            if (fileList != null) {
                for (File file : fileList) {
                    files.add(file.getName());
                }
            }
        }
        return files;
    }

    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }
}

