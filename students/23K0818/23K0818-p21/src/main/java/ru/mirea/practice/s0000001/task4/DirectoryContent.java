package ru.mirea.practice.s0000001.task4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class DirectoryContent {

    public static void main(String[] args) {
        String directoryPath = "your_directory_path_here";
        List<String> directoryContents = getDirectoryContents(directoryPath);

        for (int i = 0; i < Math.min(5, directoryContents.size()); i++) {
            System.out.println(directoryContents.get(i));
        }
    }

    public static List<String> getDirectoryContents(String directoryPath) {
        List<String> contents = new ArrayList<>();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    contents.add(file.getName());
                }
            }
        }
        return contents;
    }
}
