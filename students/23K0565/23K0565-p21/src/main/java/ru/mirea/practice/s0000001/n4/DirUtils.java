package ru.mirea.practice.s0000001.n4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirUtils {
    public List<String> saveDir(String path) {
        List<String> files = new ArrayList<>();
        File dir = new File(path);
        if (dir.isDirectory()) {
            File[] fileList = dir.listFiles();
            if (fileList != null) {
                for (File file : fileList) {
                    files.add(file.getName());
                }
            }
        } else {
            throw new RuntimeException("Не является каталогом:(");
        }
        return files;
    }

    public void printFirst5(List<String> files) {
        int count = Math.min(5, files.size());
        for (int i = 0; i < count; i++) {
            System.out.println(files.get(i));
        }
    }

    public static void main(String[] args) {
        DirUtils dirUtils = new DirUtils();
        String dirPath = ".";

        List<String> fileList = dirUtils.saveDir(dirPath);
        dirUtils.printFirst5(fileList);
    }
}
