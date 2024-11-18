package ru.mirea.practice.s0000001.task1;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

class Solution<T, K, V> {
    T t;
    K k;
    V v;

    public Solution(T t, K k, V v) {
        this.t = t;
        this.k = k;
        this.v = v;
    }

    public static <T> List<T> convertArrayToList(T[] array) {
        return new ArrayList<>(List.of(array));
    }

    public static <T> Object[] storeData(T... data) {
        return data;
    }

    public static <T> T getElementByIndex(T[] array, int index) {
        return array[index];
    }

    public static List<String> listDirectoryContents(String directoryPath) {
        File folder = new File(directoryPath);
        File[] listOfFiles = folder.listFiles();
        List<String> fileList = new ArrayList<>();
        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    fileList.add(file.getName());
                }
            }
        }
        return fileList;
    }

    public static <T> List<T> newArrayList(T... items) {
        return new ArrayList<>(List.of(items));
    }

    public static <T> Set<T> newHashSet(T... items) {
        return new HashSet<>(Set.of(items));
    }

    public static <K, V> Map<K, V> newHashMap(Map.Entry<K, V>... entries) {
        Map<K, V> map = new HashMap<>();
        for (Map.Entry<K, V> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] array = scanner.nextLine().split(" ");
            List<String> list = convertArrayToList(array);
            list.forEach(System.out::println);
        }
    }
}
