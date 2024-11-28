package ru.mirea.practice.s0000001.task4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class DirectoryUtils {
    public static List<String> getDirectoryContents(String path) {
        File directory = new File(path);
        List<String> fileList = new ArrayList<>();

        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                fileList.add(file.getName());
            }
        }

        return fileList;
    }

    public static void main(String[] args) {
        List<String> contents = getDirectoryContents("/Users/viktoriapermakova/Desktop/Java");
        contents.stream().limit(5).forEach(System.out::println);
    }
}
